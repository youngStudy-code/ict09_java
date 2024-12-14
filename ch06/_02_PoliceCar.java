package ch06;

public class _02_PoliceCar extends _02_Car {
	
	// 멤버 변수
	private String kind; // 종류 소방차 경찰차
	private int speed; // 스피드 80 100
	private String color; // 색깔 red white
	
	public _02_PoliceCar() {
		System.out.println("<<<<<<<<3. policeCar자식클래스>>>>>>>>");
	}
	
	public void siren() {
		System.out.println("사이렌을 울리다.");
	}
}
