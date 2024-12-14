package test;

// 부모 클래스 상속, 추상메소드 종료되어 abstract 미선언
public class _ex11_CompleteCale extends _ex11_Calculator {
	
	// 미 구현 메소드 구현
	@Override
	public int rest(int i, int j) {
		return i%j;
	}
}
