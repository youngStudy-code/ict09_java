package ch07;

// 자식클래스
// 4. 상속과 구현을 동시
// class 자식클래스명 extends 부모클래스 implements 인터페이스명1, .. 인터페이스명n {}

public class _05_SmartPhone extends _05_PDA implements _05_MP3, _05_Mobile {

	@Override
	public void play(){
		System.out.println("음악을 연주하다.");	
	}

	@Override
	public void stop(){
		System.out.println("음악을 멈추다.");	
	}
	
	@Override
	public void sendSms(){
		System.out.println("문자를 보낸다.");
	}
	
	@Override
	public void receiveSms(){
		System.out.println("문자를 받다.");	
	}
}
