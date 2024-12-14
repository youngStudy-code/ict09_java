package ch02;

public class _03_IfEx {

	public static void main(String[] args) {

		/*
        [if - else if - else문]
        
        if(조건식1) {   // 조건식1이 참인 경우 수행문1을 실행
           수행문1;
        }
        else if(조건식2) {  // 조건식2이 참인 경우 수행문2을 실행
           수행문2;
        }   
        else if(조건식3) {  // 조건식3이 참인 경우 수행문3을 실행
           수행문3;
        }   
        else {         // 위의 조건이 모두 해당되지 않는 경우 수행문4를 실행
           수행문4;
        }
        
        수행문5;   // 무조건 실행
       */
		
		//num이 양수/음수0 인지 판단
		int num1 = -5; // -> 결과: -5는 음수 
		//int num = 0; // -> 결과: 0은 0 
		//int num = 7; // -> 결과: 7의 양수
		
		if(num1<0) {
			System.out.println("결과 : " + num1 + "음수이다.");
		} 
		else if(num1>0) {
			System.out.println("결과 : " + num1 + "양수이다.");
		}
		else {
			System.out.println("결과 : " + num1 + "0이다.");
		}
		
		System.out.println("-----------------");
		
		int num2 = 6;
		String result = ""; //값 초기화
		
		if(num2<0) { 
			result = "음수";
			System.out.println("result는 " + result + "다.");
		}
		else if (num2>0) {
			result = "양수";
			System.out.println("result는 " + result + "다.");
		}
		else { // 위의 조건문을 모두 충족하지 않는다면 실행
			result = "0";
			System.out.println("결과 : " + num2 + "는(은) " + result);
			System.out.println("종료");
		}
		
		System.out.println("-----------------------");
		
		int score = 50;
		String result1 = "";
		
		// 60점 이상이면 합격
		if(score >= 60) {
			result1 = "합격";
		}
		// 40점 이하이면 불합격
		else if (score <= 40) {
			result1 = "불합격";
		}
		else {
			result1 = "과락";
		}
		
		System.out.println(score + "점 : " + result);
		System.out.println("<<<<3항 연산자>>>>");
		
		// 결과 = 조건식 ? 참 : 거짓;
		// 점수가 60점 이상이면 합격, 40점 이하이면 불합격
		result1 = (score <= 40)? "불합격" : "합격" ;
		System.out.println("1의 결과는 " + result1);
		
		// if-else-if else문을 모두 실행해야 할 때
		// 실제 답: 결과 = 조건식 ? 참 : (조건식 ? 참 : 거짓);
		result1 = (score >= 60)? "합격" : ((score <= 40)? "과락" : "불합격");
		System.out.println("2의 결과는 " + result1);
	}
}
