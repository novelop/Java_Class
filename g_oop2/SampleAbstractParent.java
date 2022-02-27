package g_oop2;

//추상클래스
public abstract class SampleAbstractParent {

	void method() {
		
	}
	
	 //추상메서드 - 상속 용도 
	abstract void abstractMethod();  
	
	
}

class SampleAbstractChild extends SampleAbstractParent {

	@Override
	void abstractMethod() { // 추상메소드 메소드 생성 필수 
		
		
	}
	
}