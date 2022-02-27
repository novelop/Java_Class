package g_oop2;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour() {//값을 읽음
		return hour;
	}
	public void setHour(int hour) { //값을 저장
		if(hour < 0) {
			this.hour = 0;
		}else if(hour > 23) {
			this.hour = 23;
		}else {
			this.hour = hour;
		}
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if(minute < 0 ) {
			this.minute = 0;
		}else if(59 < minute) {
			this.minute = 59;
		}else {
			this.minute = minute;			
		}
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if(second < 0) {
			this.second = 0;
		}else if(59 < second) {
			this.second = 59;
		}else {
			this.second = second;			
		}
	}
	
	void clock() {
		while(true) {
			System.out.println(toString());
			stop();
			setSecond(second + 1);
		}
	}
	
	private void stop() { //1초동안 멈춤
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String toString() {
		return hour +":" + minute + ":" + second ;
	}
	
	
	

}
