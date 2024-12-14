package ch02;

public class _14_ForEx {

	//p121
	public static void main(String[] args) {
		/*
	       * Test4. for문으로 구구단 작성
	       * 2~9단까지 출력
	       * 
	       * *** 구구단 출력 ***
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
		
		System.out.println("*** 구구단 출력 ***");
		
		// for문으로 코딩하기
		for(int dan=2; dan<=9; dan++) {
			System.out.println("=== " + dan + "단 ===");
			
			for(int i = 1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
		}		
		System.out.println("==========");
		
		System.out.println("=====while문으로 변경하기=====");
		
		// while문으로 변경하기
		
		int twoDan = 2;
				
		while(twoDan<=9) {
			twoDan++; // 3단부터 출력 
			System.out.println("=== " + twoDan + "단 ===");
		
		int i = 1;
			
		while(i<=9) {
			i++;
			// 상단에 twoDan++을 선언할 경우 +1이 된 값이 println(twoDan)에 출력된다.
			System.out.println(twoDan + " * " + i + " = " + (twoDan*i));
			}
		twoDan++; // 증감식, println이후 선언해야 +1 되기전 2단 부터 실행 가능 
		}
		System.out.println("==========");
	}
}
