package b_operator;

public class ComparingOperator {

	public static void main(String[] args) {
		/*
		 *  비교연산자
		 *  - <, >, <=, >=, ==, !=
		 *  - 문자열 비교 : equals()
		 */
		
		int x = 10;
		int y = 20;
		
		boolean b = x < y;
		System.out.println(b);
		
		b = x <= y - 15;
		// 산술연산이 비교연산보다 우선순위 높음

		
		String str1 = "abc";
		String str2 = "ABC";
		
		b = str1 == str2; //문자 내용이 아니라 주소비교
		System.out.println(b);
		
		b= !str1.equals(str2);//문자내용 비교 
		System.out.println(b);
		
		//다음의 문장들을 코드로 작성해 주세요.
		// x는 y보다 작거나 같다.
		// x + 5와 y는 같다.
		// y는 홀수이다.
		// "기본형"과 "참조형"은 다르다. 
		
		b = x <= y;
		b = x + 5 == y;
	    b = y % 2 == 1;
		str1 = "기본형";
		str2 = "참조형";
		b = !str1.equals(str2);
		b = !"기본형".equals("참조형");
		
		
	}

}
