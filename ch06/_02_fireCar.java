package ch06;

// 자식클래스
public class _02_fireCar extends _02_Car {
	
	// 멤버 변수
	private String kind; // 종류 소방차 경찰차
	private int speed; // 스피드 80 100
	private String color; // 색깔 red white
	
	public _02_fireCar() {
		System.out.println("<<<<<<<<2. fireCar자식클래스>>>>>>>>");
	}
	
	public void water() {
		System.out.println("물을 뿌리다.");
	}
}
