package ch02;

public class _08_WhileEx {

	public static void main(String[] args) {
		
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
		
		System.out.print("=========== 1. 1~10까지 출력 ===========");
		int i = 1;
		
		while (i<11) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("=========== 2. 1~10까지 합계 출력 ===========");
		// 1.초기값
		int j = 1;
		int sum1 = 0;
		
		// 2.조건식
		while(j<11){ 
			
			// 합계 먼저 구하고
			sum1 += j; // sum1 = sum1 + j
			// 증감
			j++;
		}
		System.out.println(sum1);
	
		System.out.println("\n=========== 3. 1~10까지 과정 출력 ===========");	
		// k sum2
		// 1 + 0 = 1
		// 2 + 1 = 3
		// 10 + 45 = 55
		// 반복문 종료~
		int k = 1;
		int sum2 = 0;

		while(k<11){
			
			int result = k+sum2;
			
			System.out.println(k + "+" + sum2 + "=" + result);
			
			sum2 += k;
			k++;
		}
	}
}
