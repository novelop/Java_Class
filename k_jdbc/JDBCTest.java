package k_jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JDBCTest {

	public static void main(String[] args) {
		
		String sql = "select * "
				+ " from customer"
				+ " where MEM_NAME like '%'|| ? ||'%'";
		
		ArrayList<Object> param = new ArrayList<Object>();
		param.add("김");
		
		List<Map<String, Object>> list = JDBCUtil.selectList(sql,param);
        System.out.println(list);
        
        sql ="select *"
        		+ " from customer";
        
        list = JDBCUtil.selectList(sql);
        System.out.println(list);
        
       sql = "select *"
       		+ " from member"
       		+ " where mem_id = ?";
       param = new ArrayList<Object>();
       param.add("a001");
        
       Map<String, Object> map = JDBCUtil.selectOne(sql, param);
       System.out.println(map);
        
		sql = "select max(mem_mileage)" + " from customer";

		map = JDBCUtil.selectOne(sql);
		System.out.println(map);
		
		
		sql = "update customer"
				+ " set mem_name = '이쁜이'"
				+ " where mem_name = '앙금이'";
		int num = JDBCUtil.update(sql);
		System.out.println(num);
		
		sql = "update customer"
				+ " set mem_name = '노앙금' "
				+ " where mem_id = ?";
		 param = new ArrayList<Object>();
	     param.add("x001");
	     
		num = JDBCUtil.update(sql,param);
		System.out.println(num);
		
		sql = "insert into cart values(?,?,?,?)";
		param = new ArrayList<Object>();
		param.add("a001");
		param.add("2005040100001");
		param.add("P201000019");
		param.add(3);
		num = JDBCUtil.update(sql,param);
		System.out.println(num);
		
       
	}

}