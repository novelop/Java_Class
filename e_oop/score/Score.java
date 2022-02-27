package e_oop.score;

import java.util.Arrays;

public class Score {

	public static void main(String[] args) {
		String[] studentNames = {"김기웅","박태정","이정규","오지현"};
		Student[] students = new Student[studentNames.length];	
       
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
			
			students[i].name = studentNames[i];
			students[i].kor = (int)(Math.random() * 101);
			students[i].eng = (int)(Math.random() * 101);
			students[i].math = (int)(Math.random() * 101);
			students[i].rank = 1;
		}
		
		for(int i = 0; i < students.length; i++) {
			
			students[i].sum += students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round(students[i].sum / 3.0 * 100) / 100.0;
		}
		
	
		
		
		for(int i = 0; i < students.length; i++) {
			for(int j = 0; j < students.length; j++) {
				if(students[i].sum < students[j].sum ) {
					students[i].rank ++;
				}
			}
		}
		//정렬
		for(int i = 0; i < students.length - 1; i++) {
			int min = i; 
			for(int j = i + 1; j < students.length ; j++) {
				if(students[j].rank < students[min].rank) {
				    min = j;
				}
				Student temp = students[i];
				students[i] = students[min];
				students[min] = temp;
			}
		}

		int[] subSum = new int[3];
		for (int i = 0; i < students.length; i++) {
			subSum[0] += students[i].kor;
			subSum[1] += students[i].eng;
			subSum[2] += students[i].math;
		}
		
		double[] subAvg = new double[3];
		for (int i = 0; i < subAvg.length; i++) {
			subAvg[i] = Math.round((double)subSum[i]/students.length * 100) / 100.0;
		}
		
		
		System.out.println("이름\t국어\t수학\t영어\t합계\t평균\t석차");
		for(int i = 0; i < students.length; i++) {
			System.out.print(students[i].name + "\t");
			System.out.print(students[i].kor + "\t");
			System.out.print(students[i].math + "\t");
			System.out.print(students[i].eng + "\t");
			System.out.print(students[i].sum + "\t");
			System.out.print(students[i].avg + "\t");
			System.out.print(students[i].rank + "\t");
			System.out.println();
		}
		
		
		System.out.print("과목합계\t");
		for (int i = 0; i < 3; i++) {
			System.out.print(subSum[i] +"\t");
		}
		System.out.println();
		System.out.print("과목평균\t");
		for (int i = 0; i < 3; i++) {
			System.out.print(subAvg[i] +"\t");
		}
		
	}

}
