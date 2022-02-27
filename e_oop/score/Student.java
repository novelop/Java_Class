package e_oop.score;

public class Student {

	String name;
	int kor;
	int eng;
	int math;
	int sum;
	double avg;
	int rank;
	
	//score 내용 메소드 만들기 
	//학생이 할 수 있는 것만 
	
	
	//0 ~ 100사이의 랜덤한 점수 저장
	
	void random(Student[] students, String[] studentNames) {

		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
			students[i].name = studentNames[i];
			students[i].kor = (int) (Math.random() * 101);
			students[i].eng = (int) (Math.random() * 101);
			students[i].math = (int) (Math.random() * 101);
			students[i].rank = 1;
		}
	}
    //학생별 점수합계,평균
	void nameSumAvg(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			students[i].sum += students[i].kor + students[i].eng + students[i].math;
			students[i].avg = Math.round(students[i].sum / 3.0 * 100) / 100.0;
		}
	}
	
	//석차 구하기

	void rank(Student[] students) {
		for (int i = 0; i < students.length; i++) {
			for (int j = 0; j < students.length; j++) {
				if (students[i].sum < students[j].sum) {
					students[i].rank++;
				}
			}
		}
	}
	
	//정렬 
	void change(Student[] students) {
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
	}
	

	
	//출력
	void print(Student[] students) {
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

	}
	
	
	
	
}
 
