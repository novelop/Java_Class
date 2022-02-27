package e_oop;

public class AirCon {

	/*
	 * 전원 , 풍량, 온도 메서드 
	 */
	
	 boolean power = false;
	 int temp = 20;
	 int air =1;
	 
	
	
	
	void power() {
		power = !power;
		System.out.println(power ? "켜짐" : "꺼짐");
	}
	

	
	void tempUp() {
		if(power && temp < 30) {
		  temp++;
		  System.out.println("에어컨의 온도를 1도 올립니다.");
		  System.out.println("현재 온도는 " + temp + "도 입니다."  );
		} 
		if(!power) {
			System.out.println("에어컨의 전원이 꺼져있습니다.");
		}
		if(temp == 30) {
			System.out.println("최고온도입니다.");
		}
	    
		
	}
	
	void tempDown() {
		if(power && temp > 18) {
		  temp--;
		  System.out.println("에어컨의 온도를 1도 내립니다.");
		  System.out.println("현재 온도는 " + temp + "도 입니다."  );
		} 
		if(!power) {
			System.out.println("에어컨의 전원이 꺼져있습니다.");
		}
		if(temp == 18) {
			System.out.println("최저온도입니다.");
		}
		
	}
	
	void airUp() {
		if(power && air < 3) {
			  air++;
			  System.out.println("에어컨의 풍량을 1단계 올립니다.");
			  if(air == 2) {
				 System.out.println("약풍으로 변경되었습니다.");  
			  }else {
				  System.out.println("강풍으로 변경되었습니다.");
			  }
			 
			}
		
		if(!power) {
			System.out.println("에어컨의 전원이 꺼져있습니다.");
		}
		
	}
	
	void airDown() {
		if(power && air > 1) {
			  air--;
			  System.out.println("에어컨의 풍량을 1단계 내립니다.");
			  if(air == 2) {
				 System.out.println("약풍으로 변경되었습니다.");  
			  }else {
				  System.out.println("미풍으로 변경되었습니다.");
			  }
			}
		if(!power) {
			System.out.println("에어컨의 전원이 꺼져있습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		
		AirCon a = new AirCon();
		while (true) {
			System.out.println("1.전원 2.온도+ 3.온도- 4.풍량++ 5.풍량-- 0.종료>");
			int input = ScanUtil.nextInt();

			switch (input) {
			case 1:
				a.power();
				break;
			case 2:
				a.tempUp();
				break;
			case 3:
				a.tempDown();
				break;
			case 4:
				a.airUp();
				break;
			case 5:
				a.airDown();
				break;
			case 0:
				System.out.println("종료되었습니다.");
				System.out.println(0);
			}
		}
		
		
		
	}
	
}
