package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudent {

	public static void main(String[] args) {
		//25칸 배열에 이름저장
		//랜덤으로 몇명 뽑음 ,몇명뽑을지 입력 받아서 
		//중복 안됨 
		//이미뽑은 사람과 안뽑힌 사람 
		
		String[] name = {"강동주","강정인","강현수","곽성상","김기웅",
				         "김민지","김형돈","노혜지","박태정","서난희",
				         "예현의","오지현","오혜지","유정민","이병진",
				         "이수민","이슬기","이유정","이의찬","이정규",
				         "이종민","장문석","정다영","최민규","최혁진"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇명을 뽑으시겠습니까?(숫자입력):");
		int num = Integer.parseInt(sc.nextLine());
		
		String[] choice = new String[num]; //뽑힌 사람
		
		System.out.println(num);
		String n = null;
		

		 int random = (int) (Math.random() * 25);
		 
			choice[0] = name[random];
		

			for (int i = 0; i < num; i++) {
				do {
					random = (int) (Math.random() * 25);
					 n = name[random];
				} while (n.equals(choice[i]));
				choice[i] = name[random];
			}

			System.out.println(Arrays.toString(choice));
	      
			
	
		
		

	}

}
