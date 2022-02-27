package b_operator;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 *  논리연산자
		 *  - &&(AND), ||(OR), !(NOT)
		 *  - 피연산자로 boolean만 허용한다.
		 */
		
		int x = 10;
		int y = 20;
		
		boolean b = 0 < x && x < 10 || x < y;
		//비교우선순위가 논리우선순위보다 높다.
		//산술 > 비교 > 논리 
		//&&가 || 보다 우선순위 높음 
		
		b = !(x < y); //조건식의 결과를 반대로 저장한다.
		
		//효율적 연산 
		b = true && true; //true
		b = true && false; //false 
		b = false && true; //false
		b = false && false; //false
		
		b = true || true; //true
		b = true || false; //true
		b = false || true; //true
		b = false || false; //false
		
		int a = 10;
		b = a < 5 && 0 < a++; //왼쪽에서 false 발생시 오른쪽 실행 안함 
		System.out.println(a);
		
		//다음의 문장들을 코드로 작성해주세요.
		//1. x가 y보다 크고 x가 10보다 작다.
		   b = x > y && x < 10;
		//2. x가 짝수이고 y보다 작거나 같다.
		   b = x % 2 ==0 && x <= y;
		//3. x가 3의 배수이거나 5의 배수이다.
		   b = x % 3 ==0 || x % 5 == 0;
	}

}
