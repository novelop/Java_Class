package c_statement;

import java.util.Scanner;

public class BaseBall {
	public static void main(String[] args) {
		/* 10의 자리 랜덤한 숫자 3개
		 * 123
		 * 
		 * 135 : 1S 1B 1O
		 * S: 자리수랑 숫자도 맞을때
		 * B: 숫자만 맞을때 
		 * O: 아무것도 안맞을때 
		 * 379 : 0S 0B 1O
		 * 124 : 1S 1B 1O
		 * 248 : 1S 2B 0O
		 * 842 : 0S 3B 0O 
		 * 428 : 3S
		 * 
		 */

			Scanner sc = new Scanner(System.in);
			int n = 0;
			
			int xsum = 0;
			int ysum = 0;
			int zsum = 0;
			
			int n1 = (int)(Math.random()*9) + 1;
			int n2 = (int)(Math.random()*9) + 1;
			int n3 = (int)(Math.random()*9) + 1;
			int num = (n1 * 100) + (n2 * 10) + n3;
			System.out.println(num);
			
			do{
				System.out.println("첫번째 숫자 입력>");
				int x = Integer.parseInt(sc.nextLine());
				System.out.println("두번째 숫자 입력>");
				int y = Integer.parseInt(sc.nextLine());
				System.out.println("세번째 숫자 입력>");
				int z = Integer.parseInt(sc.nextLine());
				
				n = (x * 100) + (y * 10) + z;
				System.out.println(n);
				
				if(n1 == x)xsum++;
				else if(n1 == y || n1 == z)ysum++;
				else zsum++;
				
				if(n2 == y)xsum++;
				else if(n2 == x || n2 == z)ysum++;
				else zsum++;
				
				if(n3 == z)xsum++;
				else if(n3 == x || n3 == y)ysum++;
				else zsum++;
				
				
//				if(n2 == y)xsum++;
//				if(n3 == z)xsum++;
//				
//						
//				
//				if(n1 == y || n1 == z ) ysum++;
//				if(n2 == x || n2 == z ) ysum++;
//				if(n3 == x || n3 == y ) ysum++;
//				
//				if(n1 != x && n1 != y && n1 != z ) zsum++;
//				if(n2 != x && n2 != y && n2 != z ) zsum++;
//				if(n3 != x && n3 != y && n3 != z ) zsum++;
				

				
				System.out.println(xsum + "S" + ysum + "B" + zsum +"O");
				 xsum = 0;
				 ysum = 0;
				 zsum = 0;
				 
				
			}while (num != n);
		
	}

}
