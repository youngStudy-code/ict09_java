package ch07;

// p281
// 부모클래스-추상클래스
public abstract class _01_Computer{
	
	// 일반메서드 구현
	public void turnOn(){
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff(){
		System.out.println("전원을 끕니다.");
	}
	
	// 추상메서드 선언 (바디가 없는 경우): public abstract void display();
	// 클래스 안에 추상클래스 1개라도 있는 경우에는 추상클래스가 된다.
	
	// 불안전한 메소드 (new를 해버리면 문제가 생김)
	public abstract void display(); 
	public abstract void typing();
	
}
