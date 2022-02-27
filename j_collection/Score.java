package j_collection;

import java.util.ArrayList;

public class Score {

	public static void main(String[] args) {
		/*
		 * 우리반 모두의 국어, 영어, 수학, 사회, 과학, Oracle, Java 점수를
		 * 0~100사이의 랜덤한 점수로 생성해주시고, 아래와 같이 출력해주세요.
		 * 
		 * 이름		국어		영어		수학		사회		과학		Oracle	Java	합계		평균		석차
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 홍길동		90		90		90		90		90		90		90		630		90.00	1
		 * 과목합계	450		450		450		450		450		450		450
		 * 과목평균	90.00	90.00	90.00	90.00	90.00	90.00	90.00
		 */
		
		ArrayList<ArrayList<Integer>> score = new ArrayList<ArrayList<Integer>>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> subject = new ArrayList<String>();
		
		String[] names = {"강동주", "강정인", "강현수", "곽성상", "김기웅"
				        , "김민지", "김형돈", "노혜지", "박태정", "서난희"
				        , "예현의", "오지현", "오혜지", "유정민", "이병진"
				        , "이수민", "이슬기", "이유정", "이의찬", "이정규"
				        , "이종민", "장문석", "정다영", "최민규", "최혁진"};
	    String[] subjects = {"국어", "영어", "수학", "사회", "과학", "Oracle", "Java"};
		
		for(int i = 0; i < names.length; i++) {
		    name.add(i,names[i]);
		}
		
		for(int i = 0; i < subjects.length; i++) {
		    subject.add(i,subjects[i]);
		}
		
//		System.out.println(name);
//		System.out.println(subject);
		
		//점수 등록
		for(int i = 0; i < name.size(); i++) {
			score.add(new ArrayList<Integer>());
			for(int j = 0; j <subject.size(); j++) {
				score.get(i).add(j,(int)(Math.random()*101));
			}
		}
		
//		System.out.println(score);
		
		//학생별 합계, 평균
		ArrayList<Integer> sums = new ArrayList<Integer>();
		ArrayList<Double> avgs = new ArrayList<Double>();
		int sum = 0;
		for(int i = 0; i < score.size(); i++) {
			for(int j = 0; j < score.get(i).size(); j++) {
				sum += score.get(i).get(j);
			}
			sums.add(sum);
			avgs.add(Math.round((double)sum / score.get(i).size() * 100) / 100.00);
			sum = 0;
		}
//		System.out.println(sums);
//		System.out.println(avgs);
	
		ArrayList<Integer> subSums = new ArrayList<Integer>();
		ArrayList<Double> subAvgs = new ArrayList<Double>();
		
		//과목별 합계 
		for(int i = 0; i < subject.size(); i++) {
			sum = 0;
			for(int j = 0; j < score.size(); j++) {
				sum += score.get(j).get(i);
			}
			subSums.add(sum);
		    subAvgs.add(Math.round((double)sum / score.size() * 100) / 100.00);
			
		}
		
//		System.out.println(subSums);
//		System.out.println(subAvgs);
	
	   //석차 
		ArrayList<Integer> rank = new ArrayList<Integer>();

		for(int i = 0; i < sums.size(); i++) {
         	 rank.add(1);
			for( int j = 0; j < sums.size(); j++) {
				if(sums.get(i) < sums.get(j)) {
					rank.set(i,rank.get(i) + 1);
				}
			}
		}
		//System.out.println(rank);
		
		//정렬
		for(int i = 0; i < rank.size() - 1; i++) {
			int min = i;
			for(int j = i + 1; j < rank.size(); j++) {
				if(rank.get(min) > rank.get(j)) {
					    min = j;
				}
		        
			}
			score.set(i,score.set(min,score.get(i)));
			name.set(i, name.set(min,name.get(i)));
			rank.set(i, rank.set(min,rank.get(i)));
			sums.set(i,sums.set(min,sums.get(i)));
			avgs.set(i, avgs.set(min,avgs.get(i)));
		}
		
//		System.out.println(score);
//		System.out.println(name);
//		System.out.println(rank);
//		System.out.println(sums);
//		System.out.println(avgs);
//		
		
		
		//출력
		System.out.print("이름\t");
		for(int i = 0; i < subject.size(); i++) {
			 System.out.print(subject.get(i) + "\t" );			 
		}
		System.out.print("합계 \t");
		System.out.print("평균 \t");
		System.out.print("석차 \t");
		
		System.out.println();
		for(int i = 0; i < name.size(); i++) {
			System.out.print(name.get(i) + "\t");
			for(int j = 0; j < subject.size(); j++) {
				System.out.print(score.get(i).get(j)+ "\t");
			}
			System.out.print(sums.get(i) + "\t");
			System.out.print(avgs.get(i) + "\t");
			System.out.print(rank.get(i) + "\t");
			System.out.println();
		}
		System.out.print("과목합계\t");
		for(int i = 0; i < subSums.size(); i++) {
			 System.out.print(subSums.get(i) + "\t");
		}
		System.out.print("\n과목평균\t");
		for(int i = 0; i < subSums.size(); i++) {
			 System.out.print(subAvgs.get(i) + "\t");
		}
		
		
		
	}

}
