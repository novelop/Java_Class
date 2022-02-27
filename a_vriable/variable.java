//package a_vriable; //패키지: 클래스의 위치 
//
//import java.util.Scanner;
//
////import 단축키 : ctrl + shift + o
//
//public class variable { //클래스 : 자바 프로그램의 구성요소 (데이터)
//
//	public static void main(String[] args) { //메서드 : 명령문의 집합 
//		//주석 : 프로그램 코드로 인식하지 않는 문장(주로 코드를 설명하는데 사용)
//		
////		한줄 주석 : ctrl + shift + c
////		한줄 주석 : ctrl + shift + c
////		한줄 주석 : ctrl + shift + c
//		
//		/* 범위 주석 : ctrl + shift + /(해제: \) */ 
//		
//	    int x; 
//	    x = 10;
//	    int y = 20; 
//	    
//	    /*
//	    *기본형 타입
//	    * - 정수 : byte(1), short(2), *int(4/약20억), long(8)
//	    * - 실수 : float(4/7자리), *double(8/15자리)
//	    * - 문자 : char(2)
//	    * - 논리 : boolean(1)
//	    *
//	    *참조형 타임
//	    * - 문자열 : String(4) 주소저장
//	    *
//	    *명명규칙
//	    * - 영문자 대소문자, 한글, 숫자, 특수문자(_,$)를 사용할 수 있다.
//	    * - 숫자로 시작할 수 없다.
//	    * - 예약어는 사용할 수 없다.
//	    * - [낙타식 표기법을 사용한다.(mySampleVariable)]
//	    * - [클래스명의 첫글자는 대문자로 한다.(MySampleClass)]
//	    */
//		
//	    long a = 300000000000L; //접미사 L을 붙여야 long타입이 된다. 
//	    float b = 3.14f; //접미사 f를 붙여야 float타입이 된다.
//	    char c = '가';
//	    boolean d = true; //true, false 
//	    String e = "가나다라";
//	    
//	    byte by = 1; 
//	    short sh = 2;
//	    int i = 300;
//	    long l = 400000000L;
//	    float f = 0.5f;
//	    double du = 0.555555555;
//	    char ch = 'a';
//	    boolean boo = false;
//	    String st = "hello";
//	    
//	    
//	    
//	    //형변환(데이터의 타입을 다른 타입으로 변경하는 것)
//	    int _int = 10;
//	    long _long = 20L;
//	    
//	    _int = (int)_long;
//		_long = _int; //표현범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다. 
//		
//		//변수 3개를 선언해 변수의 타입과 다른 타입의 값으로 초기화 해주세요.
//		
//		char 앙금 = 'A';
//		int gumi = 41;
//		float no = 0.401f;
//		
//		앙금 = (char)gumi;
//		앙금 = (char)no;
//		gumi = 앙금;
//		gumi = (int)no;
//		no = 앙금 ;
//		no = gumi;
//		
//		//실수타입 정수보다 표현범위 큼
//		
//		
//		//출력(콘솔)
//		
//		System.out.print("출력");
//		System.out.println("출력 후 줄바꿈");
//		System.out.printf("출력 포맷 지정");
//		
//		//실행 단축기 : ctrl + f11
//		
//		//탈출 문자
//		System.out.println();
//		System.out.println("탭은\t4칸에 맞춰 띄워줍니다.");
//		System.out.println("줄바꿈을\n을 해줍니다.");
//		System.out.println("\"쌍따옴표를 넣어줍니다\"");
//		System.out.println("\\역슬래시를 넣어줍니다.");
//		
//		//입력 
//		//Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
//		
//		/*
//		 * System.out.print("숫자를 입력해주세요>"); int nextInt = sc.nextInt();
//		 * System.out.println("입력받은 숫자:" + nextInt);
//		 */
//		//nextInt() 버그 입력 끝남 
//		
////		System.out.print("숫자 입력>");
////		int num = Integer.parseInt(sc.nextLine());
////		System.out.println("입력받은 숫자 : " + num);
////		
////		System.out.println("아무 문자열이나 입력해주세요>"); 
////		String str = sc.nextLine();
////		System.out.println("입력받은 내용:"+ str);
//		
//		//자신의 이름을 저장할 변수를 선언하고 Scanner를 사용해 변수에 이름을 저장해주세요.
//		
//		Scanner sc = new Scanner(System.in); //입력받기 위한 클래스
//		System.out.print("이름:");
//		String name = sc.nextLine();
//		
//		//자신의 나이를 저장할 변수를 선언하고 Scanner를 사용해 변수에 나이를 저장해주세요.
//		
//		System.out.print("나이>");
//		int myAge = Integer.parseInt(sc.nextLine());
//		
//		//이름과 나이를 출력해 주세요
//		System.out.println("이름:"+ name);
//		System.out.println("나이:"+ myAge);
//		System.out.println("이름:" + name + "/ 나이:" + myAge);
//		
//		
//	}
//
//}
