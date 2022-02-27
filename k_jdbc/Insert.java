package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		//데이터베이스 접속 정보 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "HJ97";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "insert into customer"
		    		+ " values(?,?,?)"; 
		     ps = con.prepareStatement(sql);
		     ps.setString(1, "y001");
			 ps.setString(2, "노혜지");
			 ps.setInt(3, 5000);
			 
			int result= ps.executeUpdate();
			System.out.println(result); 
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //닫을때는 역순으로 닫아준다.
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		 
	}

}
