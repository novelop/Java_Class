package j_collection;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import e_oop.ScanUtil;

public class Board {

	public static void main(String[] args) {
		/*
		 * ArrayList와 HashMap을 사용해 게시판 테이블을 만들고, 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
		 * 
		 * 번호, 제목, 내용, 작성자, 작성일
		 * 
		 * 목록 - 조회(상세), 등록 조회 - 수정, 삭제
		 * 
		 */

		ArrayList<HashMap<String, Object>> boardTable = new ArrayList<HashMap<String, Object>>();
		HashMap<String, Object> board = new HashMap<String, Object>();
		board.put("작성자", "앙금");
		board.put("제목", "앙금이의 일기");
		board.put("번호", 1);
		board.put("작성일", new Date());
		board.put("내용", "나는 고양이다.");
		boardTable.add(board);

		while (true) {

			int count = 1; // 게시판 번호
			System.out.println("1.조회하기 2.등록하기 ");
			// 게시판 목록 출력
			System.out.println("제목 / 작성자 / 작성일");
			Object getNum = null;
			Object getTitle = null;
			Object getWriter = null;
			Object getDate = null;
			for (int i = 0; i < boardTable.size(); i++) {
				board = boardTable.get(i);
				for (String key : board.keySet()) {
					if (key.equals("번호")) {
						board.put(key, i + 1);
						getNum = board.get(key);
					} else if (key.equals("제목")) {
						getTitle = board.get(key);
					} else if (key.equals("작성자")) {
						getWriter = board.get(key);
					} else if (key.equals("작성일")) {
						getDate = board.get(key);
					}
				}
				System.out.print(i + 1 + "." + getTitle + "\t");
				System.out.print(getWriter + "\t");
				System.out.print(getDate);
				System.out.println();
			}
			int input = ScanUtil.nextInt();
			if (input == 2) { // 등록
				board = new HashMap<String, Object>();
				board.put("번호", count);
				System.out.println("제목을 입력하세요");
				String str = ScanUtil.nextLine();
				board.put("제목", str);
				System.out.println("내용을 입력하세요");
				str = ScanUtil.nextLine();
				board.put("내용", str);
				System.out.println("작성자을 입력하세요");
				str = ScanUtil.nextLine();
				board.put("작성자", str);
				board.put("작성일", new Date());

				boardTable.add(board);
			

			} else if (input == 1) { // 상세조회
				System.out.println("조회하고 싶은 글의 번호를 입력해주세요");
				input = ScanUtil.nextInt();
				Object getMore = null;
				for (int i = 0; i < boardTable.size(); i++) {
					board = boardTable.get(i);
					for (String key : board.keySet()) {
						if (i == input - 1) {
							if (key.equals("번호")) {
								getNum = board.get(key);
							} else if (key.equals("제목")) {
								getTitle = board.get(key);
							} else if (key.equals("작성자")) {
								getWriter = board.get(key);
							} else if (key.equals("작성일")) {
								getDate = board.get(key);
							} else if (key.equals("내용")) {
								getMore = board.get(key);
							}
						}
					}
				}
				System.out.println("==================== 상세 조회 =======================");
				System.out.println("1.수정 2.삭제 3.나가기(아무키나)");
				System.out.println(getNum + "." + getTitle + "\t");
				System.out.println("작성자 : " + getWriter + "\t 작성일:" + getDate);
				System.out.println(getMore);
				System.out.println("======================================================");
				int num = ScanUtil.nextInt();
				if(num == 1) {//수정
				    System.out.println(getNum +"번 게시글 수정");
					System.out.println("제목을 입력하세요");
					String str = ScanUtil.nextLine();
					board.put("제목", str);
					System.out.println("내용을 입력하세요");
					str = ScanUtil.nextLine();
					board.put("내용", str);
					System.out.println("작성자을 입력하세요");
					str = ScanUtil.nextLine();
					board.put("작성자", str);
					board.put("수정일", new Date());
					System.out.println("수정 완료");
				}else if(num == 2) {//삭제 
					System.out.println(getNum +"번 게시글 삭제");
				    boardTable.remove(input - 1);
					System.out.println("삭제 완료");
				}
			}

		}//while문 
	}

}