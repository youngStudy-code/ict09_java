package ch06;

// 자식클래스_2
public class _04_tiger extends _04_Animal {
	
	// 부모 메소드
	@Override // 재정의
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
	public void drunk() {
		System.out.println("호랑이 술을 마신다.");
	}
}
