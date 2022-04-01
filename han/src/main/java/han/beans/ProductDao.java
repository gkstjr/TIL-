package han.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
	
	public List<ProductDto> selectList() throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select * from product";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<ProductDto> list = new ArrayList<>();
		
		while(rs.next()) {
			ProductDto productDto = new ProductDto();
			productDto.setNo(rs.getInt("no"));
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));
		
			list.add(productDto);
		}
		
			con.close();
			return list;
	}

	public List<ProductDto> selectList(String name,String type) throws Exception{
		Connection con = JdbcUtils.getConnection();
		
		String sql = "select* from product where name = ? and type = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, type);
		ResultSet rs = ps.executeQuery();
		
List<ProductDto> list = new ArrayList<>();
		
		while(rs.next()) {
			ProductDto productDto = new ProductDto();
			productDto.setNo(rs.getInt("no"));
			productDto.setName(rs.getString("name"));
			productDto.setType(rs.getString("type"));
			productDto.setPrice(rs.getInt("price"));
			productDto.setMade(rs.getString("made"));
			productDto.setExpire(rs.getString("expire"));
		
			list.add(productDto);
		}
		
			con.close();
			return list;
			}

	public ProductDto selectone(int number) throws Exception{
			Connection con = JdbcUtils.getConnection();
			
			String sql = "select * from product where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, number);
			ResultSet rs = ps.executeQuery();
			ProductDto productDto;
			if(rs.next()) {
				 productDto = new ProductDto();
				productDto.setNo(rs.getInt("no"));
				productDto.setName(rs.getString("name"));
				productDto.setType(rs.getString("type"));
				productDto.setPrice(rs.getInt("price"));
				productDto.setMade(rs.getString("made"));
				productDto.setExpire(rs.getString("expire"));
				
			}else {
				productDto=null;
			}
		
			con.close();
			return productDto;
			
	}
		public void insert(ProductDto productDto) throws Exception {
			Connection con = JdbcUtils.getConnection();
			
			String sql = "insert into product values(?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productDto.getNo());
			ps.setString(2, productDto.getName());
			ps.setString(3, productDto.getType());
			ps.setInt(4, productDto.getPrice());
			ps.setString(5, productDto.getMade());
			ps.setString(6, productDto.getExpire());
			ps.execute();
			con.close();
			
		}

		public boolean update(ProductDto productDto) throws Exception{
			Connection con = JdbcUtils.getConnection();
			
			String sql = "update product set name=?,type=?,price=?,made=?,expire=? where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,productDto.getName());
			ps.setString(2, productDto.getType());
			ps.setInt(3, productDto.getPrice());
			ps.setString(4, productDto.getMade());
			ps.setString(5, productDto.getExpire());
			ps.setInt(6,productDto.getNo());
			int count = ps.executeUpdate();
			
			con.close();
			return count>0;
		}

		public boolean delete(ProductDto productDto) throws Exception{
			Connection con = JdbcUtils.getConnection();
			String sql = "delete product where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, productDto.getNo());
			int count = ps.executeUpdate();
			
			con.close();
			return count>0;
				
		}
		public boolean sale(ProductDto productDto) throws Exception{
			Connection con = JdbcUtils.getConnection();
			
			String sql = "update product set price = price - price*10/100 where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setInt(1,productDto.getNo());
			int count = ps.executeUpdate();
			
			con.close();
			return count>0;
		}
		
}

