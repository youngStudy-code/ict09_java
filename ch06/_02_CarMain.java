package ch06;

// 메인클래스 (값 입력)
public class _02_CarMain {
	
	public static void main (String args[]) {
		
		System.out.println("<<<<<<4. _02_PoliceCar>>>>>>>>");
		_02_fireCar fc = new _02_fireCar();
		fc.setCar("소방차");
		fc.setSpeed(80);
		fc.setColor("red");
		fc.printInfo();		
		fc.water();
		
		System.out.println( );

		System.out.println("<<<<<<5. _02_fireCar>>>>>>>>");
		_02_PoliceCar pc = new _02_PoliceCar();
		pc.setCar("경찰차");
		pc.setSpeed(100);
		pc.setColor("white");
		pc.printInfo();
		pc.siren();
	}
}
