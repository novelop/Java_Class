//package d_array;
//
//import java.util.Arrays;
//
//public class Array {
//
//	public static void main(String[] args) {
//		
//
//		/*
//		 * 배열
//		 * - 여러개의 값을 하나의 변수에 저장해서 사용하는 것이다.
//		 * - 참조형 타입이다.
//		 * - 인덱스로 값을 구분한다.
//		 * - 길이를 변경할 수 없다.
//		 */
//		
//	   int[] array; //배열의 주소를 저장할 공간이 만들어진다.
//	   array = new int[5]; //배열이 생성되고 그 주소가 저장된다.
//	   //기본값이 저장된다. 기본값 0
//	   
//	   /*
//	    * 변수 = 100번지(주소)
//	    * 
//	    * 100번지 
//	    * {0, 0, 0, 0, 0}
//	    * 의 주소는 첫번째 값
//	    * 
//	    */
//	   
//	   array = new int[] {1, 2, 3, 4, 5};
//	   
//	   //array = {1, 2, 3, 4, 5};
//	   int[] array2 = {1, 2, 3, 4, 5};
//	   
//	   array[0]  = 10;
//	   array[1] = 20;
//	   array[2] = 30;
//	   array[3] = 40;
//	   array[4] = 50;
//	   
//	   System.out.println(array); //배열의 주소 출력
//	   System.out.println(array[0]);
//	   System.out.println(array[1]);
//	   System.out.println(array[2]);
//	   System.out.println(array[3]);
//	   System.out.println(array[4]);
//	   
//	   
//	   for(int i = 0; i < array.length; i++) {
//		   array[i] = 10 * (i + 1);
//	   }
//	
//	   for(int i = 0; i < array.length; i++) {
//		   System.out.println(array[i]);
//	   }
//	   
//	   
//	   //10개의 정수를 저장할 수 있는 배열을 선언 및 초기화 해주세요.
//	   int[] array3 = new int[10];
//	    //배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요.
//	    for(int i = 0; i < array3.length; i++) {
//	    	array3[i] = (int)(Math.random() * 100)+1;
//	    }
//	    System.out.println(Arrays.toString(array3));
//	    
//	    //배열에 저장된 모든 값의 합계와 평균을 출력해주세요.
//		int sum = 0;
//		double avg = 0;
//
//		for (int i = 0; i < array3.length; i++) {
//			sum +=array3[i];
//		}
//	     
//		avg = (double)sum / array3.length;
//		
//		System.out.println("합계:" + sum + " 평균:" + avg);
//		
//		//배열에 저장된 값들 중 최소값과 최대값을 출력해주세요.
//		
//		//최대값, 최소값을 저장할 변수를 만들고 배열의 첫번째 값을 저장한다.
//		//변수에 저장된 값과 배열의 모든 인덱스의 값을 비교하기 위한 for문을 만들다.
//		//최소값이 저장된 변수와 배열의 값을 비교해서 더 작은 값을 찾으면 변수에 저장한다.
//		//최대값이 저장된 변수와 배열의 값을 비교해서 더 큰 값을 찾으면 변수에 저장한다.
//		
//	    int max = array3[0];
//	    int min = array3[0];
//
//		for (int i = 0; i < array3.length; i++) {
//			if(max <= array3[i]) {
//				max = array3[i]; 
//			}
//			if(min >= array3[i]) {
//				min = array3[i];
//			}
//		}
//		System.out.println("최대값:"+ max + " 최솟값:" + min);
//	    
//		
//		
//		int[] shuffle = new int[10];
//		for(int i = 0; i < shuffle.length; i++) {
//			shuffle[i] = i + 1;
//		}
//		System.out.println(Arrays.toString(shuffle));
//		
//		//배열의 값을 섞어주세요.
//		//랜덤 인덱스랑 0번 인덱스의 자리를 여러번 바꾼다.
//		
//		int change = 0;
//		int num = 0;
//		for(int i =0; i < 100; i++) {
//			num = (int)(Math.random() * 9) + 1;
//			change = shuffle[0];
//			shuffle[0] = shuffle[num];
//			shuffle[num] = change;
//		}
//		System.out.println(Arrays.toString(shuffle));
//		
//		for(int i = 0; i < shuffle.length * 10; i++) {
//		int random = (int)(Math.random() * shuffle.length);
//		int temp = shuffle[random];
//		shuffle[random]=shuffle[0];
//		shuffle[0] = temp;
//		}
//		
//		//1~10 사이의 랜덤값을 500번 생성하고, 생성된 횟수를 출력해주세요.
//		//1이 몇개 2가 몇개 각각 횟수 출력
//		
//		int arr[] = new int[10];
////		for(int i = 0; i < 500; i++) {
////			int random = (int)(Math.random() * 10) + 1;	
////			if(random == 1 ) arr[0]++;
////			if(random == 2 ) arr[1]++;
////			if(random == 3 ) arr[2]++;
////			if(random == 4 ) arr[3]++;
////			if(random == 5 ) arr[4]++;
////			if(random == 6 ) arr[5]++;
////			if(random == 7 ) arr[6]++;
////			if(random == 8 ) arr[7]++;
////			if(random == 9 ) arr[8]++;
////			if(random == 10 ) arr[9]++;
////		}
//		
//		int[] counts = new int[10];
//		for(int i = 0; i < 500; i++) {
//			int random = (int)(Math.random() * 10) + 1;	
////			for(int j = 0; j < 10; j++) {
////				if(random == j+1) arr[j]++;
////			}
//		     counts[random - 1]++;
//		}
//		
//		System.out.println(Arrays.toString(counts));
//		
//		
//		//System.out.println(Arrays.toString(arr));
//		
//		
//		
//		
//	}
//
//}
