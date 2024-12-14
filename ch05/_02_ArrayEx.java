package ch05;

public class _02_ArrayEx {
	public static void main(String args[]) {
		
		// 방법2. 선언과 생성을 동시에 한다... 추천
		// int[] scores = new int[갯수];
		// scores[index] = 값;
		
		System.out.println("<<<방법2. int[] scores = new int[갯수];>>>");
		
		String [] drink = new String[5];
		
		drink[0] = "펩시라임";
		drink[1] = "데미소다";
		drink[2] = "아메리카노";
		drink[3] = "아침엔 사과";
		drink[4] = "토레타";
		
		for(int i=0; i<5; i++) {
			System.out.println("drink[" + i + "]" + "=" + drink [i] );
		}

		// 방법4) 선언과 할당을 동시에 한다. .. 제일 많이 사용
		// int[] scores = {값1, 값2,...};    
		
		System.out.println("\t");
		
		System.out.println("<<<방법4. int[] scores = {값1, 값2,...};>>>");
		
		String [] food = {"양념치킨", "돼지고기", "신전떡볶이", "양꼬치", "방어회"};
		
		for(int j=0; j<food.length; j++) {
			System.out.println("food[" + j +"]" + "=" + food[j]);
		}
		
		// 항상된 for문
		System.out.println("");
		System.out.println("<<< 항상된 for문 >>>");
		
		//	for(변수:배열) {
		//	반복 실행문;
		//	}
		
		String [] foodArr = {"양념치킨", "돼지고기", "신전떡볶이", "양꼬치", "방어회"};
		
		for(String str : foodArr) {
			System.out.println(str);
		}
		
		
	}

}
