package d_array;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를 
		 * 0~100 사이의 랜덤한 점수로 생성해주시고, 아래와 같이 출력해주세요.
		 * 석차순으로 정렬 
		 * 
		 * 이름   국어    영어   수학 	사회   과학  Oracle  Java  합계  평균  석차 
		 * 홍길동  90     90    90  	90    90    90      90    630  90.0  1 
		 * 홍길동  90     90    90  	90    90    90      90    630  90.0  1 
		 * 홍길동  90     90    90  	90    90    90      90    630  90.0  1 
		 * 홍길동  90     90    90  	90    90    90      90    630  90.0  1 
		 * 홍길동  90     90    90  	90    90    90      90    630  90.0  1 
		 * 홍길동  90     90    90  	90    90    90      90    630  90.0  1 
		 * 과목합계 450   450   450   450   450   450     450
		 * 과목평균 90.00 90.00 90.00 90.00 90.00 90.00  90.00
		 */
        String[] title = {"이름","국어","영어","수학","사회","과학","Oracle","Java","합계","평균","석차"};
		String[] name = {"강동주","강정인","강현수","곽성상","김기웅",
		                 "김민지","김형돈","노혜지","박태정","서난희",
		                 "예현의","오지현","오혜지","유정민","이병진",
		                 "이수민","이슬기","이유정","이의찬","이정규",
		                 "이종민","장문석","정다영","최민규","최혁진"};
		
		int[][] scores = new int[25][7];
		int[] sum = new int[25];
		double[] avg = new double[25];
		int[] subSum = new int[7];
		double[] subAvg = new double[7];
		int[] rank = new int[25];
		
		
		// 랜덤 값 생성
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int) (Math.random() * 101);
			}

			System.out.println(Arrays.toString(scores[i]));
		}

		// 학생별 합계 , 평균 구하기
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				sum[i] += scores[i][j];// 합계
			}
			avg[i] = Math.round((sum[i] / (double) scores[i].length) * 100) / 100.0; // 평균
		}
		System.out.println(Arrays.toString(sum));
		System.out.println(Arrays.toString(avg));

		// 석차 구하기
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				if (sum[i] < sum[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println(Arrays.toString(rank));

		// 석차순으로 순서 바꾸기

		for (int i = 0; i < rank.length-1; i++) {
			int min = i;
			for (int j = i+1; j < rank.length; j++) {
				if (rank[j] < rank[min]) {
					min = j;
				}
			}
			
			String temp = name[i];
			name[i] = name[min];
			name[min] = temp;

			int[] temp2 = scores[i];
			scores[i] = scores[min];
			scores[min] = temp2;

			int temp3 = sum[i];
			sum[i] = sum[min];
			sum[min] = temp3;

			double temp4 = avg[i];
			avg[i] = avg[min];
			avg[min] = temp4;

			int temp5 = rank[i];
			rank[i] = rank[min];
			rank[min] = temp5;
		}
		 

		// 제목 출력
		for (int i = 0; i < title.length; i++) {
			System.out.print(title[i] + "\t");
		}

		// 줄바꿈
		System.out.println();
		
		//출력 
		for(int i = 0; i < scores.length; i++) {
			System.out.print(name[i]+"\t");
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.print(sum[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(rank[i]+"\t");
			
			System.out.println();
		}
		
		System.out.print("과목합계\t");
		//과목별 합계 
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < scores.length; j++) {
				  subSum[i] += scores[j][i];
			}
			subAvg[i] = subSum[i] / (double)scores.length;
		    System.out.print(subSum[i] + "\t");
		  
		}
		System.out.println();
	    //과목별 평균
		System.out.print("과목평균\t");
		for (int i = 0; i < 7; i++) {
			System.out.print(subAvg[i] + "\t");
		}
		
		
		
		
		
		
		
	}

}
