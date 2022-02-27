package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Select {

	public static void main(String[] args) {
		//데이터베이스 접속 정보 
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "HJ97";
		String password = "java";
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, user, password);
			
			String sql = "select * "
					+ " from customer"
					+ " where MEM_NAME like '%'|| ? ||'%'";
			ps = con.prepareStatement(sql);
			ps.setString(1, "김");
			
			rs = ps.executeQuery();
			
			ResultSetMetaData metaData = rs.getMetaData();
			int columnCount = metaData.getColumnCount();
			
			while(rs.next()) {
				for(int i = 1; i<=columnCount; i++) {
					System.out.print(rs.getString(i) + "\t");
				}
				System.out.println();
			}
			 
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally { //닫을때는 역순으로 닫아준다.
			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}
		 
	}

}
