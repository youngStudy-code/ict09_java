package ch07;

// p282
// 자식클래스_1
// 부모클래스가 추상클래스면 자식도 추상클래스로 셋팅
public class _01_DeskTop extends _01_Computer {
	
	@Override
	public void display() {
		System.out.println("_01_DeskTop-display");
	}

	@Override
	public void typing() {
		System.out.println("_01_DeskTop-typing");
	}
}
