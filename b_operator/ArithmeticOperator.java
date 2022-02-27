//package b_operator;
//
//public class ArithmeticOperator {
//
//	public static void main(String[] args) {
//		/* 
//		 * 산술연산자 
//		 * - 사칙연산 : +, -, *, /, %(나머지)
//		 * - 복합연산 : +=, -=, *=, /=, %=
//		 * - 증감연산 : ++, --
//		 */
//		
//		int result = 10 + 20 - 30 * 40 / 50 % 6;
//		
//		result = 10 / 3;
//		System.out.println(result);
//		result = 10 % 3;
//		System.out.println(result);
//		
//		//5개의 산술연산자를 사용해 5개의 연산을 수행 후 결과를 출력하세요.
//		
//	    int puls = 23 + 46;
//	    int gob = 33 * 2;
//	    int pulpul = 34 % 2;
//	    int mama = 25-3;
//	    int nanugi = 476/34;
//		
//	    System.out.println(puls);
//	    System.out.println(gob);	
//	    System.out.println(pulpul);	
//	    System.out.println(mama);	
//	    System.out.println(nanugi);	
//	    
//	    //복합연산
//	    result = result + 3;
//	    
//	    result += 3;
//	    result -= 5;
//	    result *= 2;
//	    result /= 3;
//	    
//	    //오른쪽 연산 끝난 뒤 수행 
//	
//	    //아래의 문장을 복합연산자를 사용한 문장으로 만들어주세요.
//	    //result = result + 10;
//	    
//	    //result = result % 5;
//	    
//	    //result = result - 2 * 3;
//	    
//	    
//	    result += 10;
//	    System.out.println(result);
//	    result %= 5;
//	    System.out.println(result);
//	    result -=2*3;
//	    System.out.println(result);
//	    
//	   //증감연산 
//	   //증가연산자(++) : 변수의 값을 1 증가시킨다.
//	   //감소연산자(--) : 변수의 값을 1 감소시킨다.
//	    
//	    int i = 0;
//	    
//	    ++i; //전위형 : 변수의 값을 읽어오기 전에 1증가된다.
//	    i++; //후위형 : 변수의 값을 읽어온 후에 1 증가된다.
//	    --i;
//	    i--;
//	    
//	    i=0;
//	    System.out.println("++i =" + ++i);
//	    i=0;
//	    System.out.println("i++ =" + i++);
//	    System.out.println(i);
//	
//	    //피연산자의 타입이 서로 같아야만 연산이 가능하다.
//	    int _int = 10;
//	    double _double = 3.14;
//	    double result2 = (double)_int + _double;
//	    //작은 쪽에서 큰쪽으로 형변환 
//	    
//	    byte _byte = 5;
//	    short _short = 10;
//	    _int = (int)_byte + (int)_short;
//	   //int보다 작은 타입은 int로 자동으로 형변환 됨
//	    
//	    char _char = 'a';
//	    char _char2 = 'b';
//	    _int = _char + _char2;
//	    System.out.println(_int);
//	    //int로 형변환 됨
//	    
//	    
//	    //오버플로우, 언더플로우
//	    //표현범위를 벗어나는 값을 표현할 때 발생하는 현상 
//	    byte b = 127;
//	    b++;
//	    System.out.println(b);
//	    b--;
//	    System.out.println(b);
//	    
//	    //다음을 한줄씩 계산해서 최종 결과값을 출력해주세요.
//	    //1. 123456 + 654321
//	    //2. 1번의 결과값 * 123456
//	    //3. 2번의 결과값 / 123456
//	    //4. 3번의 결과값 - 654321
//	    //5. 4번의 결과값 % 123456
//	   
//	    long result1= 0;
//	   
//	    
//	    result1 = 123456 + 654321;
//	    result1 *=123456;
//	    result1 /=123456;
//	    result1 -=654321;
//	    result1 %=123456;
//	    System.out.println(result1);
//	    
//	    //3개의 int타입 변수를 선언 및 초기화 후 합계와 평균을 구해주세요.
//	    
//	    int fir = 344;
//	    int sec = -455;
//	    int th = 239;
//	    int sum = fir + sec + th;
//	    double avg= sum /3.0; //실수까지 계산
//	    System.out.println("합계:"+ sum + "/평균:" + avg);
//
//	    
//	    //반올림
//	  //  avg = Math.round(avg); //소수점 첫째자리에서 반올림해준다.
//	    
//	    avg = Math.round(avg * 10) / 10.0;
//	    System.out.println(avg);
//	    
//	    //랜덤 : Math.random() - 0.0 ~ 1.0미만
//	     int random = (int)(Math.random() * 100) + 1;
//	     System.out.println(random);
//	}
//	
//	
//
//}
