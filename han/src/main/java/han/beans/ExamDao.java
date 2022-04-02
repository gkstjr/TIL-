package han.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ExamDao {
//등록 메소드
	public void insert(ExamDto examDto) throws Exception{
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "insert into exam values(exam_seq.nextval,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, examDto.getStudent());
		ps.setString(2, examDto.getSubject());
		ps.setString(3, examDto.getType());
		ps.setInt(4, examDto.getScore());
		ps.execute();
		con.close();
		
	}

	public boolean update(ExamDto examDto) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "update exam set student = ?,subject = ?,type= ?,score=? where exam_id= ?";
		PreparedStatement ps =con.prepareStatement(sql);
				ps.setString(1, examDto.getStudent());
				ps.setString(2, examDto.getSubject());
				ps.setString(3, examDto.getType());
				ps.setInt(4, examDto.getScore());
				ps.setLong(5, examDto.getExamId());
				
				int count = ps.executeUpdate();
				con.close();
				
				return count>0;
		
	}

	public boolean delete(int number) throws Exception{
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@www.sysout.co.kr:11521:xe","kh4","kh4");
		
		String sql = "delete exam where exam_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, number);
		int count = ps.executeUpdate();
		
		return count>0;
		
	}

	public List<ExamDto> selectList() throws Exception{
			Connection con = JdbcUtils.getConnection();
			String sql = "select*from exam order by exam_id asc";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List<ExamDto> list = new ArrayList<>();
			while(rs.next()) {
				ExamDto examDto = new ExamDto();
				examDto.setExamId(rs.getLong("exam_id"));
				examDto.setStudent(rs.getString("student"));
				examDto.setSubject(rs.getString("subject"));
				examDto.setType(rs.getString("type"));
				examDto.setScore(rs.getInt("score"));
				
				list.add(examDto);
			}
			con.close();
			return list;
			
	}
	public List<ExamDto> selectList(String type,String keyword) throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from exam where instr("+type+",?)>0 order by exam_id asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery(); 
		List<ExamDto> list= new ArrayList<>();
		
		while(rs.next()) {
			ExamDto examDto = new ExamDto();
			examDto.setExamId(rs.getLong("exam_id"));
			examDto.setStudent(rs.getString("student"));
			examDto.setSubject(rs.getString("subject"));
			examDto.setType(rs.getString("type"));
			examDto.setScore(rs.getInt("score"));
			
			list.add(examDto);
		}
		con.close();
		return list;
	}

}
