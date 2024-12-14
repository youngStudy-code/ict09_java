package ch02;

public class _17_ForEx {

	public static void main(String[] args) {
		//p112
		/*
	       * [ do-while ]
	       * => {} 안의 문장을 무조건 한번 수행한 후에 조건식이 참이면 반복, 거짓이면 빠져나간다.
	       * 
	       * do {
	       *     수행문1;
	       *     ...
	       * } while(조건식);    
	       * 수행문2;
	    */
		
		int num = 1;
		int sum = 0;
		
		do {
			sum+=num; 
			// sum = sum + num -> 1+0
			// 2 = 1 + 1 
			
			num++; 
			// 1~10까지 충족
		} 
		while (num<=10); 
		// 1<=10 -> 충족
		// 11<=10 -> 미충족
		
		// 11 이상 이면 출력
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");
	}

}
