package ch02;

public class _06_SwitchCaseEx {
	// 2024-11-05 복습
	public static void main(String[] args) {
		
		 int scroe = 50;
		 String result = "";

		/*
		 * 
		 * 60점 이상이면 합격, 40점이면 불합격, 그 이하면 과락 
		 * 
		 * if(score >= 60){
		 * 	result = "합격";
		 * }
		 * else if(score <= 40) {
		 * 	result = "불합격";
		 * }
		 * if {
		 * 	result = "과락";
		 * }
		 * System.out.println(score + "점: " + result);
		 * */
		
		System.out.println("<<<<< 3항 연산자 >>>>>>");
		
		// 결과 = 조건식? 참:거짓
		// 점수가 60점 이상이면 합격, 40점 이하 이면 불합격
		result = (scroe>=60)? "합격 입니다." : "불합격 입니다.";
		result = (scroe>=60)? "합격 입니다." : ((scroe<=40) ? "과락" : "불합격");
		
		System.out.println("result는 " + result);
		
		
		System.out.println("-------------------------");
		
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
		
		 // ranking에 따른 금메달 출력
	     // ranking 1:"금메달", 2:"은메달", 3:"동메달", 그외 "참가상"  => 결과 : 순위 :1, 메달:금메달
		
		// 순위 
		int ranking = 5;
		
		// 메달
		String medal = "";
		
		switch(ranking) {
		case 1 : medal = "금메달";
			break;
		case 2 : medal = "은메달";
			break;
		case 3 : medal = "동메달";
			break;
		default : medal = "참가상";
			break;
		}
		System.out.println(ranking + "순위는 " + medal);
		
		System.out.println("-------------------------");
		
		/*
		반복문 : 조건이 참인 동안 계속해서 반복 수행(while문, for문)
        1.초기값 -> 2.조건식 -> 3.증감식
        
		 [ while 문법 ]
		 1. 초기값;
		 while(조건식) { // 2. 조건식
		    수행문1;
		    증감식;  // 3. 증감식
		 }
		 수행문2;
		 
		 [ 무한루프 ]
		 while(true) {
		     break;  => 해당 반복문을 빠져나간다.
		 }
		*/
		
		// 출력 => HappyDay1^^   HappyDay2^^  HappyDay3^^  HappyDay4^^  HappyDay5^^
		// 반복문 종료^^

		
		// 초기값은 1
		int count = 1;
		
		while(count<6) {
			System.out.println("HappyDay" + count + "^^");
			count++;
		}
		System.out.println("반복문 종료^^");
		
		System.out.println("-------------------------");
		
		/*
		반복문 : 조건이 참인 동안 계속해서 반복 수행(while문, for문)
        	1.초기값 -> 2.조건식 -> 3.증감식
        
		 [ while 문법 ]
		 1. 초기값;
		 while(조건식) { // 2. 조건식
		    수행문1;
		    증감식;  // 3. 증감식
		 }
		 수행문2;
		 
		 [ 무한루프 ]
		 while(true) {
		     break;  => 해당 반복문을 빠져나간다.
		 }
		*/
		
		System.out.println("=========== 1. 1~10까지 출력 ===========");
		
		int i=1;
		
		while (i<11) {
			System.out.println(i);
			i++;
		}

		System.out.println("=========== 2. 1~10까지 합계 출력 ===========");
		
		// 초기값, 시작값
		int j=1;
		// 합계
		int sum=0;
		
		// j가 10일떄 까지만 실행한다.
		// j가 1 이면,
		// j가 2 이면,
		// j가 10이면,
		
		while(j<11) {
			
			// sum = sum + j
			// sum = 0 + 1 = 1
			// sum = 1 + 2 = 2
			// sum = 55
			sum+=j;
			
			// 1
			// 2
			//9
			j++;
		}
		System.out.println(sum);
		
		System.out.println("=========== 3. 1~10까지 과정 출력 ===========");	
		
		// k + sum2 = sum2
		// 1 + 0 = 1
		// 2 + 1 = 3
		// 10 + 45 = 55
		// 반복문 종료~
		
		int k = 1;
		int sum2 = 0;
		
		while (k<=10){
			//sum2 = sum2 + k;
			sum2+=k;
			
			System.out.println(k + "+" + sum2 + "=" + sum2);
			
			//10까지만 실행 (11<=10 미충족 조건 확인 후 while문 빠져 나옴)
			k++;
		}
		
		System.out.println("-------------------------");
		
		
		// 구구단 2단만 출력
		/* 
		* === 2단 ===
		* 2 * 1 = 2
		* ...
		* 2 * 9 = 18
		* ==========
		*/
		
		// 2단
		int dan = 2;
		
		// 1~9단 까지만 들어갈 숫자
		int num = 1;
		
		System.out.println("=== 2단 ===");
		
		while (num <= 9) {
			System.out.println(dan + "*" + num + "=" +(dan*num));
			num++;
		}
		System.out.println("==========");
		
		System.out.println("-------------------------");
		
		/*
		 * [while 문법]
		 * while(조건식){ 
		 * 	수행문1;
		 * 	
		 * while(조건식){
		 * 	수행문2;
		 * 	증감식;
		 * }
		 * 증감식;
		 * }
		 * */
		
		/*
	       * Test3. while문으로 구구단 작성
	       * 2~9단까지 출력
	       * 
	       * ****************
	       * *** 구구단 출력 ***
	       * ****************
	       * === 2단 ===
	       * 2 * 1 = 2
	       * ...
	       * 2 * 9 = 18
	       * === 9단 ===
	       * 9 * 1 = 9
	       * ...
	       * 9 * 9 = 81
	       * ==========  마지막에 한번만
	      */

		
		System.out.println("****************");
		System.out.println("*** 구구단 출력 ***");
		System.out.println("****************");
		
		// 단은 2단 부터 9단 까지
		// 곱해지는 숫자는 1부터 9까지
		// 즉 두개의 while 문의 필요
		// 메인이 되는 단수안에 곱해지는 숫자 넣기
		
		int dan1 = 2;
		
		// 단은 2단 부터 9단 까지
		while (dan1 <= 9) {
			System.out.println("=== " + dan1 + " ===");
			
			//10에서 종료 된 후, 다시 i는 1에서 시작(초기화)
			int i1 = 1;
			
			//곱해지는 숫자는 1부터 9까지
			while (i1 <= 9) {
				System.out.println(dan1 + "*" + i1 + "=" + (dan1*i1));
				i1++; //10에서 조건문 종료 
				}
			dan1++; // 단+1
			 }
		
		System.out.println("==========  마지막에 한번만");
	}
}
