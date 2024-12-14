package ch01;

// p74 산술연산자
public class _07_OperatorEx {
	public static void main (String args[]) {
		/*
		 * 연산
		 * 1. 사칙연산자
		 * */
		System.out.println("=====1.사칙연산자=======");
		 /*
	       * 연산
	       * 2.증감연산자 => 매우 중요
	       * 1) 전위연산자 => y = ++x; => x값을 먼저 1증가시키고, 증가한 값을 y에 대입한다.
	       * 2) 후위연산자 => y = x++; => x값을 먼저 y에 대입한 후, x값을 1증가시킨다.
	       */
		
		// 전위연산자
		int c = 5;
		int nextC = ++c;
		System.out.println("c: " + c); //6이 나오는 이유? ++C (C를 먼저 1을 증가 시켜라) 
		System.out.println("++c: " + nextC); //6
		
		// 후위연산자
		int d = 5;
		System.out.println("d+: " + d); //5
		
		int nextD = d++;
		System.out.println("nextD: " + nextD); //5
		System.out.println("d: " + d); //6
		
		System.out.println("--------------------");
		int e = 2, f = 3, result = 0;
		
		// 집중복습
		// A.e++ / B.--f  / C.e--
		// A의 값을 먼저 계산 후 C에 대입한다. (X, %, / 먼저)
		// B값을 계산한다.
		System.out.println(e++ + --f * e--); // 2 + 2 * 3 = 8
		System.out.println(++e + --f * e--); // 3 + 1 * 3 = 6
		
		/*
		System.out.println(e++ + --f * e--); // 2 + 2 * 3 = 8
		System.out.println("e : " + e); // 3
		System.out.println("f: " + f);  // 2
		*/
		
		/*
		// System.out.println(e++ + --f * e--); // 2 + 2 * 3 = 8
		result = ++e + --f * e--; // 3 + 1 * 3 = 6
		System.out.println("result: " + result); // 6
		System.out.println("e : " + e); //  2
		System.out.println("f: " + f);  // 1
		*/
		
		
		// double->int 형변환
		double a = 1/2;
		System.out.println(a); 
		// int/int = 0.3 = 0 double 형변환 0.0 int < double = 묵시적 형변환 (자동)
		
		/*
	    * 연산
	    * 3.관계연산자 => 매우 중요
	    * - >, <, >=, <=, 같다(==), 같지않다(!=)
	    * - 결과값은 boolean 타입 : 참(true), 거짓(false) 
	    */
	    System.out.println("=== 3.관계연산자 ===");	
	    
	    int c1 = 10;
	    int c2 = 20;
	    
	    System.out.println("c1 == c2: " + (c1 == c2)); //false
	    System.out.println("c1 != c2: " + (c1 != c2)); //true
	    System.out.println("c1 > c2: " + (c1 > c2)); //false
	    System.out.println("c1 < c2: " + (c1 < c2)); //true
	    System.out.println("c1 >= c2: " + (c1 >= c2)); //false
	    System.out.println("c1 <= c2: " + (c1 <= c2)); //true
	    
	    /*
	       * 연산
	       * 4.논리연산자 => 매우 중요
	       * - 1 => 참(true) | 0 => 거짓(false)
	       * - &&(논리곱) : 
	       * - ||(논리합) :  
	       */
	      
	      System.out.println("=== 4.논리연산자 ===");
	      
	      int z1 = 4, y1 = 5;
	      System.out.println(z1==4 && y1==5); //T && T = 1 * 1 = 1 True
	      System.out.println(z1==4 && y1==10); //T && F = 1 * 0 = 0 False
	      System.out.println(z1==4 || y1==7); //T || F = 1 + 0 = 1 True 
	      System.out.println(z1==7 || y1==7); //F || F = 0 + 0 = 0 False    
	      
	      /* 연산
	       * 5.복합대입연산자 => 매우 중요
	       */
	      System.out.println("=== 5.복합대입연산자 ===");
	      
	      //ii(15) = ii(5)+10
	      int ii = 5;
	      ii+=10; 
	      System.out.println("ii+:" + ii); // 5 + 10 = 15
	      
	      // ii = ii-10;
	      ii-=10;
	      System.out.println("ii-:" + ii); // 15 - 10 = 5
	      
	      // ii = ii*10;
	      ii*=10;
	      System.out.println("ii*:" + ii); // 5 * 10 = 50
	      
	      // ii = ii/10;
	      ii/=10;
	      System.out.println("ii/:" + ii); // 50 / 10 = 5
	      
	      // ii = ii%10;
	      ii%=10;
	      System.out.println("ii%:" + ii); // 5 % 10 = 5
	}
}




















