package ch05;

public class _03_ArrayEx {
	public static void main(String args[]) {
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
