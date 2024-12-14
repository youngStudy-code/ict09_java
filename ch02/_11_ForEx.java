package ch02;

public class _11_ForEx {
	public static void main(String args[]) {
		/*
	       * 반복문 : 조건이 참인동안 반복(while문, for문)
	       * 
	       * for(초기값; 조건식; 증감식) {  // 반복횟수
	       *     수행문1;
	       *     수행문2;...
	       * }
	       */
	      
		// 출력 => HappyDay1^^   HappyDay2^^  HappyDay3^^  HappyDay4^^  HappyDay5^^
		//        반복문 종료^^   
	
		int count = 0;
		for(count=1; count<=5; count++) { //count는 for문 안에서의 실행되는 지역변수
			System.out.print("HapplyDay" + count + "^^\t"); 
		}
		System.out.println("반복문 종료^^"); //sysout + ctrl + 스페이스
		System.out.println();
		
		
		// 출력 => HappyDay5^^   HappyDay4^^  HappyDay3^^  HappyDay2^^  HappyDay1^^
		//        반복문 종료^^  
		
		// count초기값은 5, count는 0이하 이면 조건문을 실행하지 않는다.
		for(count=5; count>=1; count--) {  
			// 오류 사례: count<=1로 설정 시 조건문 충족불가로 실행 X
			System.out.print("HapplyDay" + count + "^^\t"); 
		}
		System.out.println("반복문 종료^^");
		
	}
}
