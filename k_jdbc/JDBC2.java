package k_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

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
					
					String sql = "select *"
							+ " from cart " //앞공백 필수 
							+ " where cart_member = ? "
							+ " and cart_qty > ?";
					ps = con.prepareStatement(sql);
					ps.setString(1, "a001"); //첫번째 물음표 , 값만 들어갈수 있다. 
					ps.setInt(2, 5); //두번째 물음표 
					//ps.setObject(0,sql); 타입 상관 x
					
					rs = ps.executeQuery();
					
					ResultSetMetaData metaData = rs.getMetaData();
					//메타데이터 : 데이터에 대한 데이터 
					
					int columnCount = metaData.getColumnCount();
					
					while(rs.next()) {//인덱스 1부터 시작
						for(int i = 1; i <= columnCount; i++) {
							System.out.print(rs.getObject(i) + "\t");
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
