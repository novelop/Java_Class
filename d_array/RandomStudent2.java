package d_array;

import java.util.Arrays;
import java.util.Scanner;

public class RandomStudent2 {

	public static void main(String[] args) {

         String[] students = {"김기웅","박태정","이정규","오지현"};
         
          Scanner s = new Scanner(System.in);
          System.out.println("몇명?");
          int count = Integer.parseInt(s.nextLine());
          
          String[] pick = new String[count];
          int pickCount = 0;
          do {
        	  boolean flag = true;
        	  int random = (int)(Math.random()*students.length);
        	  for(int i = 0;i < pick.length; i++) {
        		  if(students[random].equals(pick[i])) {
        			  flag = false;
        		  }
        	  }
        	  if(flag) {
        		  pick[pickCount++] = students[random];
        	  }
        	  
        	  
          }while(pickCount < count);
          
          System.out.println(Arrays.toString(pick));

	}

}
