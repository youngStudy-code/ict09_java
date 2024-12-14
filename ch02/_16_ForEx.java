package ch02;

//p121
public class _16_ForEx {

	public static void main(String[] args) {
		
		/*
	       * [ break문 ]
	       * - 반복문이 중첩되어 있을 경우 break문은 가장 가까운 반복문만 종료한다.
	       * - 반복문안에서 continue문을 만나면, 아래의 문장은 수행하지 않되 계속수행하며,
	       *    beeak문을 만나면 반복문을 더 이상 수행하지 않고 빠져나올때 사용한다.
	     */
		
	    // 1~100까지 더하기, sum이 100 이상이면 빠져나온다.
		int sum = 0;
		int num = 0;
		
		// 초기값, 조건식(생략), 증감식
		for (num = 0; ; num++) {
			
			// sum값 구하기
			sum+=num;
			
			// sum이 100이상일 경우
			if(sum>=100) //{
				
			// 빠져 나와라
			break;
			// }
		}
		System.out.println("num : " + num);
		System.out.println("sum : " + sum);

	}
}
