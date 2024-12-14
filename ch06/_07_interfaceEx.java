package ch06;


public class _07_interfaceEx {
	public static void main(String[] args) {
		
		// class First의 새로운 생성자를 생성한다.
		// 왜? method1 메소드의 있는 값을 호출 하기 위해.
		First f	= new First();
		
		// new 생성자 작업 없이 다이렉트로 바로 호출하는 방법
		// new 생성하여 method1 호출
		// 값을 주는 곳 
		f.method1(new Second()); 
		
		// Second s = new Second();
		// s.method1();
		// method1은 class First 있는데
	}
}

class First {
	// 값을 담는 곳 = 값을 주는 곳
	// Second s = new Second();
	public void method1(Second s) {
		
		System.out.println("First - method1");
		
		// Second s = new Second();
		// method2 호출
		s.method2(new Third());
	}
}

class Second {
	//Third td = new Third();
	public void method2(Third td) {
		System.out.println("second - method2");
		
		// method3 호출
		td.method3(new Fourth());	
	}
}

class Third {
	// Fourth fth = new Fourth();
	public void method3(Fourth fth) {
		System.out.println("third - method4");
		
		// method4 호출
		// Fourth fourth = new Fourth();
		fth.method4(new Five());
	}
}

class Fourth {
	public void method4(Five five){
		System.out.println("Fourth - method4");	
		
		//five.method5(new Five());
	}
}

class Five {
	public void method5(Six six){
		System.out.println("Five - mothod5");	
		
		// 메소드 6 호출
		six.method6();
	}
}

class Six {
	public void method6(){
		System.out.println("six - mothod6");	
	}
}




/*
 * First 클래스 - method1()
 * Second 클래스 - method2()
 * Third 클래스 - method3()
 * */
