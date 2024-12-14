package ch10;

public class _06_spreadArgs {
	
		/*
	    * 스프레드 매개변수
	    * 1. 용도 : 메서드 호출시 매개변수 개수가 일치하지 않아도 호출이 가능이 가능하도록 한다.
	    *          args는 매개변수의 수를 동적으로 처리할 수 있도록 유연성을 제공한다.
	    * 2. 방법 : 메서드의 매개변수(데이터Type ...변수)로 지정하나, 스프레드 매개변수는 1개밖에 사용할 수 없다.     
	    *          컴파일시 매개변수로 넘어온 갯수만큼 배열이 생성된다.   
	    */
	
	public _06_spreadArgs() {
		
	}
	
	public void callArgs (String arg1, String arg2) {
		System.out.println(arg1 + "," + arg2);
	}
	
	public void callArgs2 (String ...arg) {  // int 무한대로 받음
		for(int i=0; i<arg.length; i++) { 
			System.out.print(arg[i] + "");
		}
		
		System.out.println(" ");
		
		// 항상된 for문
		for(String str : arg) {
			System.out.println(str + " ");
		}	
	}
	
	public void callArgs3 (String name, int ...scores) {  
		
		System.out.println(name);
		
		for(int i=0; i<scores.length; i++) { 
			System.out.print(scores[i] + "");
		}
		
		System.out.println(" ");
		
		// 항상된 for문
		for(int str : scores) {
			System.out.println(str + " ");
		}	
	}
}
