//package b_operator;
//
//import java.util.Scanner;
//
//public class Etc {
//
//	public static void main(String[] args) {
//		/* 
//		 * 비트 연산자
//		 * - |, &, ^, ~, <<, >>
//		 * - 비트 단위로 연산한다.
//		 * 
//		 *  기타 연산자
//		 *  - .(참조연산자) : 특정 범위 내에 속해 있는 멤버를 지칭할 때 사용한다.
//		 *  - ?:(삼항연산자) : 조건식 ? 조건식이 참일 경우 수행할 문장 : 조건식이 거짓일 경우 수행 할 문장
//		 */
//
//		// 1byte : 01010101 0또는1 8개
//		System.out.println(10 | 15);
//		//10: 00001010
//		//15: 00001111
//		//    00001111
//		
//		int x = 10;
//		int y = 20;
//		 
//		int result = x < y ? x : y;
//		System.out.println(result);
//		
//		//주민등록번호 뒷자리의 첫번째 숫자가 1이면 남자 2면 여자 
//		int regNo = 5;
//		String gender = regNo == 1 ? "남자" : "여자";
//		System.out.println(gender);
//		
//		gender = regNo == 1 ? "남자" : (regNo ==2 ? "여자" : "확인불가");
//		System.out.println(gender);
//		
//		//2개의 숫자를 입력받고 , 둘 중 더 큰 숫자를 출력해 주세요.
//		
//		Scanner sc = new Scanner(System.in);
//		
////		int num1 = Integer.parseInt(sc.nextLine());
////		int num2 = Integer.parseInt(sc.nextLine());
////	    int r = num1 > num2 ? num1 : num2;
////		System.out.println(r);
////		System.out.println(num1 > num2 ? num1 : num2);
////		
//		//숫자를 입력받고, 그 숫자가 1이나 3이면 남자를 2나 4면 여자를 출력해 주세요.
//		// 그외의 숫자를 입력하면 확인불가를 출력해 주세요.
//		
//		int num1 = Integer.parseInt(sc.nextLine());
//		
//		System.out.println(num1 == 1 || num1 == 3 ? "남자" : (num1 ==2 || num1 == 4 ? "여자" : "확인불가"));
//		
//	}
//
//}
