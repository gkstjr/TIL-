package han.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	//목록
	public List<BoardDto> selectList() throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from board order by board_no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto boardDto = new BoardDto();
			
			boardDto.setBoardNo(rs.getInt("board_no"));
			boardDto.setBoardHead(rs.getString("board_head"));
			boardDto.setBoardTitle(rs.getString("board_title"));
//			boardDto.setBoardContent(rs.getString("board_content"));
			boardDto.setBoardTime(rs.getDate("board_time"));
			boardDto.setBoardReadcount(rs.getInt("board_readcount"));
			boardDto.setBoardWriter(rs.getString("board_writer"));
			//변경된 컬럼에 따라 추가 조회구문 작성
			boardDto.setBoardReplycount(rs.getInt("board_replycount"));
			list.add(boardDto);
	}
		
		
		
		con.close();
		return list;
	}
	//검색
	public List<BoardDto> selectList(String type, String keyword) throws Exception {
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from board where instr(#1,?) >0 order by board_no desc";
		sql = sql.replace("#1", type);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		
		ResultSet rs = ps.executeQuery();
		
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto boardDto = new BoardDto();
			
			boardDto.setBoardNo(rs.getInt("board_no"));
			boardDto.setBoardHead(rs.getString("board_head"));
			boardDto.setBoardTitle(rs.getString("board_title"));
//			boardDto.setBoardContent(rs.getString("board_content"));
			boardDto.setBoardTime(rs.getDate("board_time"));
			boardDto.setBoardReadcount(rs.getInt("board_readcount"));
			boardDto.setBoardWriter(rs.getString("board_writer"));
			//추가 컬럼 정보 같이 조회하도록 변경
			boardDto.setBoardReplycount(rs.getInt("board_replycount"));

			list.add(boardDto);
	}
		
		
		
		con.close();
		return list;
		
	}
	public BoardDto selectOne(int boardNo) throws Exception	{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from board where board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		ResultSet rs = ps.executeQuery();
		
		BoardDto boardDto;
		if(rs.next()) {
			boardDto = new BoardDto();
			boardDto.setBoardNo(rs.getInt("board_no"));
			boardDto.setBoardHead(rs.getString("board_head"));
			boardDto.setBoardTitle(rs.getString("board_title"));
			boardDto.setBoardContent(rs.getString("board_content"));
			boardDto.setBoardTime(rs.getDate("board_time"));
			boardDto.setBoardReadcount(rs.getInt("board_readcount"));
			boardDto.setBoardWriter(rs.getString("board_writer"));
			boardDto.setBoardReplycount(rs.getInt("board_replycount"));

		}else {
			boardDto = null;
		}
		con.close();
		return boardDto;
	}
	public boolean plusReadcount(int boardNo) throws Exception	{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "update board set board_readcount = board_readcount + 1 where board_no =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		int count = ps.executeUpdate();
		
		con.close();
		return count >0;
		
	}
	//등록
	//1. 시퀀스 번호 생성
	//2. 등록
	public int getSequence() throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql =  "select board_seq.nextval from dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int number = rs.getInt("nextval");
		
		con.close();
		return number;
	}
		
	public void insert(BoardDto boardDto) throws Exception {
		
		Connection con = JdbcUtils.getConnection();
		String sql  = "insert into board("
				+ "board_no, board_head, board_title, board_content, board_writer"
			+ ") "
//		+ "values(board_seq.nextval, ?, ?, ?, ?)";//번호를 미리 만들지 않은 경우
		+ "values(?, ?, ?, ?, ?)";//번호를 미리 만든 경우
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardDto.getBoardNo());
		ps.setString(2, boardDto.getBoardHead());
		ps.setString(3, boardDto.getBoardTitle());
		ps.setString(4, boardDto.getBoardContent());
		ps.setString(5, boardDto.getBoardWriter());
		
		ps.execute();
		
		con.close();
	}
	public boolean update(BoardDto boardDto) throws Exception {
		Connection con = JdbcUtils.getConnection();
		
		String sql = "update board "
						+ "set board_head=?, board_title=?,board_content=? "
						+ "where board_no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, boardDto.getBoardHead());
			ps.setString(2, boardDto.getBoardTitle());
			ps.setString(3, boardDto.getBoardContent());
			ps.setInt(4, boardDto.getBoardNo());
			int count = ps.executeUpdate();
			
			con.close();
			
			return count> 0;
	}
	public boolean delete(int boardNo) throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "delete board where board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		int count = ps.executeUpdate();
		con.close();
	
		return count>0;
	}

	public boolean updateReplycount(int boardNo) throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "update board set board_replycount = ("
							+ "select count(*) from reply where reply_target = ?"
							+ ") where board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		ps.setInt(2, boardNo);
		int count = ps.executeUpdate();
		
		con.close();
		
		return count>0;
	}
}
