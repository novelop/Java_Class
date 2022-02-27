//package b_operator;
//
//import java.util.Scanner;
//
//public class SimpleCalculator {
//
//	public static void main(String[] args) {
//		//두개의 숫자와 연산자를 입력받아 연산결과를 알려주는 프로그램을 만들어주세요.
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자>");
//		int num1 = Integer.parseInt(sc.nextLine());
//		System.out.println("연산자 입력>");
//		String y = sc.nextLine();
//		System.out.println("두번째 숫자>");
//		int num2 = Integer.parseInt(sc.nextLine());
//	
//		int result = y.equals("+") ? num1 + num2 
//				  : y.equals("-") ? num1 - num2
//				  : y.equals("*") ? num1 * num2
//			      : y.equals("/") ? num1 / num2
//			      : num1 % num2;
//		
//		System.out.println(y.equals("+") ? num1+ num2 : (y.equals("-") ? num1 - num2 : (y.equals("*") ? num1 * num2 : (y.equals("/") ? num1 / num2 : "확인불가"))));
//		
//	}
//
//}
