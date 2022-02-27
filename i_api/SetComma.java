package i_api;

import e_oop.ScanUtil;

public class SetComma {

	public static void main(String[] args) {
		//숫자를 입력받아 입력받은 숫자에 3자리 마다 콤마를 붙여 출력해 주세요.
		
		System.out.println("숫자입력");
		String num = ScanUtil.nextLine();
		String rev = "";
		
		int count = 0;
		for(int i = num.length() - 1; i >= 0; i--) {
			rev = num.charAt(i) + rev;
			count++;
			if(count % 3 == 0 && count != num.length()) {
				rev = "," + rev;
			}
		}
		System.out.println(rev);
		
	
		
	}

}
