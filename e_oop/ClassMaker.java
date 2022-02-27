package e_oop;

public class ClassMaker {

	//전역변수 하나를 선언 및 초기화 해주세요.
	  int num = 10;
	
	//리턴타입과 파라미터가 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 출력해주세요.
	   void a() {
		   System.out.println(num);
		   return; //메서드 종료시키는 역할 뒤에 리턴값 x
	   }
	 
	//전역변수와 동일한타입의 리턴타입이 있고 파라미터는 없는 메서드 하나를 만들어주세요.
	//메서드 안에서 전역변수를 리턴해주세요.
	   
	  int b() {
		  return num;
	  }
	  
	  //리턴타입은 없고 파리미터가 있는 메서드 하나를 만들어주세요.
	  //메서드 안에서 파라미터를 출력해주세요.
	  void c(String s) {
		  if(s.equals(" ")) {
			  return;
		  }
		  System.out.println(s);
	  }
	  
	  //int타입의 리턴타입과 int타입의 파라미터 두개가 있는 메서드 하나를 만들어주세요.
	  //메서드 안에서 두 파라미터를 곱한 결과를 리턴해 주세요.
	  int caculrater(int num1, int num2) {
	     return	num1 * num2;
	  }
	  
	  
	  
	
}
