package k_jdbc;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import e_oop.ScanUtil;

public class JDBCBoard {

	public static void main(String[] args) {
	   
       new JDBCBoard().start();
	}

	List<Map<String, Object>> boardTable = new ArrayList<Map<String,Object>>();
	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	
	void start() {
		while(true) {
			System.out.println("===================================");
			System.out.println("번호\t제목\t작성자\t작성일");
            read();
		    System.out.println("===================================");
		    System.out.println("1.조회 2.등록 0.종료>");
		    int input = ScanUtil.nextInt();
		    
		    switch(input) {
		    case 1:
		    	readMore();
		    	break;
		    case 2:
		    	insert();
		    	break;
		    case 0:
		    	System.out.println("프로그램이 종료되었습니다.");
		    	System.exit(0);
		    }
		}
	}

	private void readMore() {
		System.out.println("조회할 게시글 번호>");
		int boardNo = ScanUtil.nextInt();
		
		String sql = "SELECT *"
	      		+ " FROM TB_JDBC_BOARD"
	      		+ " WHERE BOARD_NO = ?";
		ArrayList<Object> param = new ArrayList<Object>();
		param.add(boardNo);
		
		Map<String, Object> board = JDBCUtil.selectOne(sql,param) ;
		System.out.println("======================================");
		System.out.println("번호\t: " + board.get("BOARD_NO"));
		System.out.println("--------------------------------------");
		System.out.println("작성자\t: "+ board.get("MEM_ID"));
		System.out.println("--------------------------------------");
		System.out.println("작성일\t: "+ board.get("REG_DATE"));
		System.out.println("--------------------------------------");
		System.out.println("제목\t: "+ board.get("TITLE"));
		System.out.println("--------------------------------------");
		System.out.println("내용\t: "+ board.get("CONTENT"));
		System.out.println("======================================");
		
		 System.out.println("1.수정 2.삭제 0.목록>");
		 int input = ScanUtil.nextInt();
		    
		    switch(input) {
		    case 1:
		    	update(boardNo);
		    	break;
		    case 2:
		    	delete(boardNo);
		    	break;
		    case 0:
		    	break;
		    }
		
	}

	private void delete(int boardNo) {
		String sql = "DELETE FROM TB_JDBC_BOARD"
				+ " WHERE BOARD_NO =?";
		ArrayList<Object> param = new ArrayList<Object>();
		param.add(boardNo);
		
		JDBCUtil.update(sql,param);
		System.out.println("게시글이 삭제되었습니다.");
	}

	private void update(int boardNo) {
		
		String sql = "UPDATE TB_JDBC_BOARD"
				+ " SET TITLE =?"
				+ " , CONTENT =?"
				+ " WHERE BOARD_NO =?";
		ArrayList<Object> param = new ArrayList<Object>();
		System.out.println("제목>");
		param.add(ScanUtil.nextLine());
		System.out.println("내용>");
		param.add(ScanUtil.nextLine());
		param.add(boardNo);

		JDBCUtil.update(sql,param);
		System.out.println("게시글이 수정되었습니다.");
	}

	private void insert() {
		
	  String sql = "INSERT INTO TB_JDBC_BOARD"
	  		+ " VALUES("
	  		+ " (SELECT NVL(MAX(BOARD_NO),0) + 1 FROM TB_JDBC_BOARD)"
	  		+ " ,?,?,?,SYSDATE)";
	  
	  ArrayList<Object> param = new ArrayList<Object>();

	  System.out.println("제목>");
	  param.add(ScanUtil.nextLine());
	  System.out.println("내용>");
	  param.add(ScanUtil.nextLine());
	  System.out.println("작성자>");
	  param.add(ScanUtil.nextLine());
	  
	  JDBCUtil.update(sql,param);
	  System.out.println("게시글이 등록되었습니다.");
	}

	private void read() {
      String sql = "SELECT BOARD_NO,TITLE,MEM_ID,REG_DATE"
      		+ " FROM TB_JDBC_BOARD";
      boardTable = JDBCUtil.selectList(sql);
      
      for(int i = boardTable.size() - 1; i >= 0; i--) {
	    	System.out.println("-------------------------------");
	    	Map<String, Object> board = boardTable.get(i);
	    	System.out.println(board.get("BOARD_NO")+ "\t" + board.get("TITLE")+ "\t"
	    	         + board.get("MEM_ID") + "\t" + format.format(board.get("REG_DATE")));
	    }
	}
}
