package c_statement;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		/*
		 * 조건문 - if문 - switch문
		 * 
		 * if문 - if(조건식){} : 조건식의 결과가 true이면 불럭안의 문장을 수행한다. - else if(조건식){} : 다수의 조건이
		 * 필요할때 if 뒤에 추가한다. - else{} : 조건식 이외에 경우를 위해 추가한다.
		 */

		int a = 5;

		if (a == 1) {
			System.out.println("조건식의 연산결과가 true이면 수행된다.");
		}

		if (a == 1) {
			System.out.println("a==1");
		} else if (a == 2) {
			System.out.println("a==2");
		} else if (a == 3) {
			System.out.println("a==3");
		} else {
			System.out.println("else");
		}

		// 점수가 60점 이상이면 합격 그렇지 않으면 불합격

		int score = 80;

		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 점수에 등급을 부여
		score = 90;
		String grade = null;
		// 기본값 : 자동으로 저장되는 값
		// boolean 기본값 : false

		if (90 <= score && score <= 100) {
			grade = "A";
		} else if (80 <= score) {
			grade = "B";
		} else if (70 <= score) {
			grade = "c";
		} else if (60 <= score) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println(score + "점 : " + grade);

		score = 67;
		grade = null;
		//정렬 : ctrl + shift + f

		if (90 <= score && score <= 100) {
			grade = "A";
			if (97 <= score) {
				grade += "+";
			} else if (score <= 93) {
				grade += "-";
			}
		} else if (80 <= score) {
			grade = "B";
			if (87 <= score) {
				grade += "+";
			} else if (score <= 83) {
				grade += "-";
			}
		} else if (70 <= score) {
			grade = "C";
			if (77 <= score) {
				grade += "+";
			} else if (score <= 73) {
				grade += "-";
			}
		} else if (60 <= score) {
			grade = "D";
			if (67 <= score) {
				grade += "+";
			} else if (score <= 63) {
				grade += "-";
			}

		} else {
			grade = "F";

		}
		System.out.println(score + "점 : " + grade);

		/* 
		 * switch문
		 * - switch(int/String){case 1: break;}
		 * - 조건식의 결과는 정수와 문자열(JDK1.7부터 문자열 허용) 허용한다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다.
		 */
		
		a = 30;
		
		switch(a) {
		case 10: 
			System.out.println("a==10");
			break;
		case 20:
			System.out.println("a==20");
			break;
		default:
			System.out.println("defualt");
			
		}
		//월에 해당하는 계절을 출력
		int month = 1;
		String season =null;
		
		switch(month) {
		case 3:case 4:case 5:
			season = "봄";
			break;
		case 6:case 7:case 8:
			season = "여름";
			break;
		case 9:case 10:case 11:
			 season = "가을";
			 break;
		case 12:case 2:case 1:
			 season = "겨울";
			 break;
		}
		
		System.out.println(month + "월 :" + season);
		
		score = 100;
		grade = null;
		
		switch(score / 10) {
		case 10: case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}
		
		System.out.println(score + "점 : " + grade);
		
		//숫자를 입력받아 그 숫자가 홀수인지 짝수인지 출력해주세요.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자입력:");
//		int num = Integer.parseInt(sc.nextLine());
//		String x = null;
//		
//		if(num%2 == 0) {
//			x = "짝수"; 
//		}else if(num%2 ==1) {
//			x = "홀수";
//		}
//		
//		System.out.println(x);
		
		//1~100 사이의 랜덤한 값을 3개 발생시키고 합계,평균,등급을 출력해주세요.
		
	     int num1 = (int)(Math.random() * 100) + 1;
	     int num2 = (int)(Math.random() * 100) + 1;
	     int num3 = (int)(Math.random() * 100) + 1;
	     
	     int sum = num1 + num2 + num3;
	     double avg = Math.round(sum / 3.0 * 10) / 10 ;
	     String gd = null;
	     
	     if (90 <= avg && avg <= 100) {
	    	 gd = "A";
	     }else if(80 <= avg) {
	    	 gd = "B";
	     }else if(70 <= avg) {
	    	 gd = "C";
	     }else if(60 <= avg) {
	    	gd = "D";
	     }else {
	    	 gd = "F";
	     }
	     
	     System.out.println("합계:" + sum + " 평균:" + avg + " 등급:"+ gd);
	     
	     
	     //1~ 100 사이의 랜덤한 수 3개를 발생시키고 오름차순으로  출력해주세요.
	     
			int n1 = (int) (Math.random() * 100) + 1;
			int n2 = (int) (Math.random() * 100) + 1;
			int n3 = (int) (Math.random() * 100) + 1;

			int f = 0;
			int s = 0;
			int t = 0;

			if (n1 < n2 && n1 < n3) {
				f = n1;
				if (n2 < n3) {
					s = n2;
					t = n3;
				} else {
					s = n3;
					t = n2;
				}
			} else if (n2 < n1 && n2 < n3) {
				f = n2;
				if (n1 < n3) {
					s = n1;
					t = n3;
				} else {
					s = n3;
					t = n1;
				}
			} else if (n3 < n1 && n3 < n2) {
				f = n3;
				if (n1 < n2) {
					s = n1;
					t = n2;
				} else {
					s = n2;
					t = n1;
				}
			}
	     
	     System.out.println(f);
	     System.out.println(s);
	     System.out.println(t);
	     
	     
	     if(n1 > n2) {
	    	 int temp = n1;
	    	 n1 = n2;
	    	 n2 = temp;
	     }
	     
	     if(n1 > n3) {
	    	 int temp = n1;
	    	 n1 = n3;
	    	 n3 = temp;
	     }
	     
	     if(n2 > n3) {
	    	 int temp = n2;
	    	 n2 = n3;
	    	 n3 = temp;
	     }
	     
	     System.out.println( n1 + " < " + n2 + " < " + n3); 
	     
	}		
	
	

}
