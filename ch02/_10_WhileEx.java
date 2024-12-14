package ch02;

public class _10_WhileEx {

	public static void main(String[] args) {
		/*
	 		[ while 문법 ]
	 		
			 1. 초기값;
			 while(조건식) { // 2. 조건식
			    수행문1;
			    
			    // 2-1. 초기값;
			    // while(조건식) { //2-2. 조건식
			     	수행문2;
			    	증감식;  // 2-3. 증감식
			 }
			 증감식; //3.증감식
			 }
		*/

		/*
	       * Test3. while문으로 구구단 작성
	       * 2~9단까지 출력
	       * 
	       * ****************
	       * *** 구구단 출력 ***
	       * ****************
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
		      
	      System.out.println("****************");
	      System.out.println("*** 구구단 출력 ***");
	      System.out.println("****************");
	      
	      // 단 출력
	      int dan = 2;

	      // while문 
	      while(dan<=9){
	    	  System.out.println("=== " + dan + "단 ===");
	    	  
	    	  //int num = 1; // 1~9단 동일하게 출력으로 int 초기화 하기
		      int num = 1;  // 바깥 while 문에 i값 필요 없음 
	    	  
		      while(num<=9){ 
	    		  //System.out.println("dan333333: " + dan); //2단 다시 원복
	    		  System.out.println(dan + "*" + num + "=" + (dan*num));
	    		  num++;
	    	  }
	    	  dan++;
	      }
	      System.out.println("==========");
	}
}