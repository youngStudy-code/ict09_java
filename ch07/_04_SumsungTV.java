package ch07;

// 자식클래스는 부모 인터페이스를 구현하다.
public class _04_SumsungTV implements _04_TV {
	
	@Override
	public void turnOn() {
		System.out.println(_04_TV.BRAND + " TV를 켜다.");
	}
	@Override
	public void turnOff() {
		System.out.println(_04_TV.BRAND + " TV를 끄다.");
	}
	
	// @Override
	// void turnSet(); 오버라이딩 생략
}
