package e_oop;

public class OOP {

	public static void main(String[] args) {
	   /*
	    * 객체지향 프로그래밍(Object Oriented Programming)
	    * - 프로그래밍을 단순히 코드의 연속으로 보는 것이 아니라 객체간의 상호작용으로 보는 것.
	    * - 코드의 재사용성이 높고 유지보수가 용이하다.
	    */
		
		SampleClass sc = new SampleClass();

		String returnValue = sc.method(5, "ABC");
		System.out.println(returnValue);
		
		sc.method2();
		
		sc.flowTest1();
		
		Calculator ca = new Calculator();
		
		double result = ca.sum(123456,654321);
		result = ca.gob(result, 123456);
		result = ca.mok(result, 123456);
		result = ca.mov(result, 654321);
		result = ca.nam(result, 123456);
		
	   System.out.println(result);
		
	}

}
