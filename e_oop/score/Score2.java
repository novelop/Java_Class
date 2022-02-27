package e_oop.score;

public class Score2 {

	public static void main(String[] args) {
	
		String[] studentNames = {"김기웅","박태정","이정규","오지현"};
		Student[] students = new Student[studentNames.length];	
		
		Student st = new Student();
		// stuents 초기화
		st.random(students, studentNames);
		
		// 학생별 점수합계 평균 구하기
		st.nameSumAvg(students);
		
		// 석차 구하기
		st.rank(students);
		
		// 정렬 하기
		st.change(students);
		
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
		
		st.print(students);
		
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
