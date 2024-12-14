package ch02;

public class _09_WhileEx {

	public static void main(String[] args) {
		
	// 구구단 2단만 출력
	/* 
	* === 2단 ===
	* 2 * 1 = 2
	* ...
	* 2 * 9 = 18
	* ==========
	*/
		
	int dan = 2;
	int num = 1;
	int result = 0;	
	
	System.out.println("=== 2단 ===");
	
	while(num<10) {
			
		//int result = dan * num;
		
		result = dan * num;
		System.out.println(dan + " * " + num + " = " + result);
		
		num++;
		}
		System.out.println("==========");		
	}
}
