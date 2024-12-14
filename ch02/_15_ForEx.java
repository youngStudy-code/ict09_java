package ch02;

//p119
public class _15_ForEx {

	public static void main(String[] args) {
		
		/*
	       * [ continue문 ]
	       * continue문은 반복문과 함께 사용한다.
	       * 반복문안에서 continue문을 만나면, 그 이후의 문장은 수행하지 않고,
	       * for문으로 돌아가 증감식을 수행한다.
	    */
	   
		int total = 0;
		int num;
		
		// num이 100이하일 경우에만 실행
		// 101 부터 for문 종료
		for(num=1; num<=100; num++) {
			
			// if문이 짝수일 경우 ex)10 % 2 = 0
			// if문이 홀수일 경우 ex)5 % 2 = 1 
			// num % 2 != 0, num % 2 == 1  
			if(num % 2 == 0)
				// for문 계속 실행하라
				continue; // 있는 경우 1부터 100까지의 홀수의 합은: 2500입니다.
				// 없는 경우1부터 100까지의 홀수의 합은: 2550입니다.
			
			// 홀수일 경우에만 실행 (1부터 100까지 홀수의 합계)
			total += num;		
		}
		System.out.println("1부터 100까지의 홀수의 합은: " + total + "입니다.");
	}
}
