package d_array;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
	
		
		
		/*
		 * 석차 구하기 : 점수를 비교해 작은 점수의 등수를 증가시키는 방식
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰 수를 뒤로 보내는 방식
		 * - 삽입정렬 ㅣ 두번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식 
		 * 
		 */
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] =(int)(Math.random() * 100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//석차구하기
		int[] rank = new int[arr.length];
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					rank[i]++;
				}
			}
		}
		
		//System.out.println(Arrays.toString(rank));
		
		
		//선택정렬 
		
		//최소값의 인덱스 찿기
		int min = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[min] > arr[i]) {
				min = i;
				
			}
		}
		
	
		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) { //8에서 정렬이 끝나기 때문에 -1 해줌
			min = i;
			for (int j = i + 1; j < arr.length; j++) { //다음숫자랑 비교하기위해 
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			 temp  = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		
		}

		System.out.println(Arrays.toString(arr));
		
		//버블정렬 
		
		//내가 한거
//		 int count = 0;
//	    for(int i = 0; i < arr.length - i; i++) {
//	    	for(int j = 0; j <arr.length - 1 ; j++) {
//	    		if(arr[j] > arr[j+1]) {
//		    		temp = arr[j];
//		    		arr[j] = arr[j+1];
//		    		arr[j+1] = temp;
//		    	}
//	    		System.out.println(Arrays.toString(arr));
//	    	}
//	    	
//	    }
//	    System.out.println(Arrays.toString(arr));
	    
	  
		 //답 
	    for(int i = 0; i < arr.length - 1; i++) {
	    	boolean flag = false;
	    	for(int j = 0; j <arr.length - i - 1 ; j++) { // 도는 횟수 줄이기 
	    		if(arr[j] > arr[j+1]) {
		    		temp = arr[j];
		    		arr[j] = arr[j+1];
		    		arr[j+1] = temp;
		    		flag = true;
		    	}
	    	}
	    	if(!flag) break;
	    	
	    	
	    }
	    System.out.println(Arrays.toString(arr));
	    
	    
	    
		
	    //삽입정렬
	    /*
	     * 1,0
	     * 2,1 2,0
	     * 3,2 3,1 3,0
	     * 4,3 4,2 4,1 4,0
	     * 5,4 5,3 5,2 5,1 5,0
	     * :
	     * 9,8.....9,0
	     * 
	     */
//	    temp = 0;
//	    for(int i = 1; i < arr.length - 1 ; i++) {
//	    	for(int j = i-1; j >= 0; j--) {
//	    		if(arr[i] < arr[j]){ 
//	    			temp = arr[i];
//	    		   arr[i] = arr[j];
//	    		   arr[j] = temp;
//	    		}
//	    	}
//	    }
//		System.out.println(Arrays.toString(arr));
		
		
		// 답
		    for(int i = 1; i < arr.length; i++) {
		    	int tem = arr[i];
		    	int j = 0;
		    	for(j = i - 1; j >= 0; j--) {
		    		if(tem < arr[j]){ 
		    			arr[j + 1] = arr[j]; // 더 작은 값을 만났을 경우 반복이 끝났을 경우 빈칸 채움
		    		}else {
		    			break;
		    		}
		    	}
		    	arr[j + 1] = tem;
		    }
			System.out.println(Arrays.toString(arr));
			

		
		
		
	}

}
