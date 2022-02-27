package d_array;

import java.util.Arrays;

public class Quiz {

	public static void main(String[] args) {
		
		
		int[] arr = new int[10];
		for(int i= 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 5) + 1;
		}
		System.out.println(Arrays.toString(arr));
	   /*
	    * 1~5사이의 랜덤한 값이 10개 저장된 배열에서 중복된 값이 제거된 배열을 만들어주세요.
	    * [3, 1, 2, 1, 3, 5, 1, 3, 4, 2]
	    * [3, 1, 2, 5, 4]
	    */
//		int n = 5;
//
//		for (int i = 1; i <= 5; i++) {
//			int count = 0;
//			for (int j = 0; j < arr.length; j++) {
//				if (i == arr[j]) {
//					count++;
//				}
//			}
//			if (count == 0) {
//				n--;
//			}
//		}
//
//		System.out.println(n);
//		int[] newArr = new int[n];
//
//		int nc = 0;
//		do {
//			boolean flag = true;
//			for (int i = 0; i < newArr.length; i++) {
//				for (int j = 0; j < arr.length; j++) {
//
//					if (arr[j] == arr[j - 1]) {
//
//					}
//				}
//			}
//		} while (nc < n);
//
//		System.out.println(Arrays.toString(newArr));
	    	

	    int[] temp = new int[5];
	    int count = 0;
	    for(int i = 0; i < arr.length; i++) {
	    	boolean flag = true;
	    	for(int j = 0; j < temp.length; j++) {
	    		if(arr[i] == temp[j]) {
		    		flag = false;
		    	}	
	    	}
	    	if(flag) {
	    		temp[count++] = arr[i];
	    	}
	    }
	    	    
	    System.out.println(Arrays.toString(temp));
	    
	    int[] result = new int[count];
	    for(int i = 0; i < result.length; i++) {
	    	result[i] = temp[i];
	    }
	    System.out.println(Arrays.toString(result));
	    
	    

	    
	    
	    
		
		
		
//		int[] arr = new int[20];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) (Math.random() * 5) + 1;
//
//		}
//		System.out.println(Arrays.toString(arr));
//
//		for (int i = 1; i <= 5; i++) {
//			int count = 0;
//			System.out.print(i + " : ");
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[j] == i) {
//					count++;
//					System.out.print("*");
//				}
//			}
//			System.out.print(" " +count);
//			System.out.println();
//		}
	  
	    
		/*
		 * 1~5사이의 숫자가 발생된 횟수 만큼 *을 사용해 그래프를 그려주세요.
		 * 
		 * 1: *** 3  1의 갯수가 3개  
		 * 2: ****4
		 * 3: **2
		 * 4: *****5
		 * 5: ******6
		 */
		
//		 int[] con = new int[5];
//		 for(int i = 0; i < arr.length; i++) {
//			 con[arr[i] -1]++; // ex) arr[i]= 5 면 con[4]++
//		 }
//		 for(int i = 0; i < con.length; i++) {
//			 System.out.println(i + 1 +" : ");
//			 for(int j = 0; j < con[i]; j++) {
//				 System.out.print("*");
//			 }
//			 System.out.println(" " + con[i]);
//		 }
//		
//		
		
		
		
		
		
//		int money =(int)(Math.random() * 500) *10;
//		int[] coin = { 500,100,50,10};
//		
//		System.out.println("거스름돈 :" + money);
//		
//		int[] count = new int[4];
//		 for(int i = 0; i < coin.length; i++) {
//			 count[i] = money / coin[i];
//			 money %= coin[i];
//			 System.out.println(coin[i]+ "원:" +count[i]+"개");
//		 }
//		
//			
		
		
		/*
		 * 거스름돈에 동전의 단위마다 몇개의 동전이 필요한지 출력해주세요.
		 * 
		 * 거스름돈 : 2860원
		 * 500원 : 5개 
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개 
		 * 
		 */

	    
	 
		
		
	}

}
