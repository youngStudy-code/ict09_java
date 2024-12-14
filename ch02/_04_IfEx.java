package ch02;

public class _04_IfEx {

	public static void main(String[] args) {
		 
		/* if문을 이용한 학점 구하기
	       * 1. 점수는 score 변수, 학점은 grade 변수
	       * 2. 점수가 90점 이상이면 A
	       *    점수가 80점 이상이면 B
	       *    점수가 70점 이상이면 C
	       *    점수가 60점 이상이면 D
	       *    점수가 60점 미만이면 F
	       *    범위를 벗어나면 W
	       * 3. 결과출력 => 점수 : 80, 학점 : B
	       * 
	       * || : 논리합 : OR(또는) => 양쪽 모두 거짓일 때 거짓
	       * && : 논리곱 : AND(이면서) => 양쪽 모두 참일때 참
	       *    
	       */	
		
		int score = 60;
		
		// Char grade; 도 가능, ' ' 공백을 통해 초기화 하기
		char grade = ' ';
		//String grade = "";
		
		if(score<=100 && score>=0) {
		
			//점수가 90점 이상이면 A
			if(score>=90) {
				grade = 'A';
			}
		    //점수가 80점 이상이면 B
			else if(score>=80){
				grade = 'B';
			}
		    // 점수가 70점 이상이면 C
			else if (score>=70) {
				grade = 'C';
			}
		    // 점수가 60점 이상이면 D
			else if (score>=60) {
				grade = 'D';
			}		
		    // 점수가 60점 미만이면 F
			else if (score>=60) {
				grade = 'F';
			}
			 // 범위를 벗어나면 W
			else {
				grade = 'W';
			}
			// 무조건 실행해야 하는 출력문
			System.out.println("점수: " + score + "점, " + "학점: " + grade);
		}
		else {
			// 위의 조건문을 모두 미 충족  할 경우 출력 (59점 이하)
			System.out.println("시험지 백지로 제출한 사람");
		}
		
		/*
	      switch(조건) {
	            case 값1 : 수행문1;
	                break;
	            case 값2 : 수행문2;
	                break; 
	            case 값3 : 수행문3;
	                break;             
	            default: 수행문4;
	      }
	      */
	
		// 점수가 89점인 경우 /10 = 8, case 8에 해당
		if(score<=100 && score>=0) {
			switch(score/10) {
				// 수행문이 동일하기 때문에 1번만 기입
				case 10 : 
				case 9 : grade = 'A';
					break;
				case 8 : grade = 'b';
					break;
				case 7 : grade = 'c';
					break;
				case 6 : grade = 'd';
					break;
				default : grade = 'f';
				}
				System.out.println(score + "점 은 " + grade + " 이다.");
		}
		else {
			System.out.println("시험지 백지로 제출한 사람");
		}
	}
}