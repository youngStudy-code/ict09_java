package ch06;

// 자식클래스_1
public class _04_Human extends _04_Animal {

	@Override // 재정의
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽다.");
	}
}
