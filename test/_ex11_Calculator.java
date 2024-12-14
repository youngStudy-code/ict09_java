package test;

// 부모 클래스 선언 (implements)
// rest 미구현으로 abstract 선언
public abstract class _ex11_Calculator implements _ex11Calc {
	
	@Override
	// 덧셈
	public int add(int i, int j) {
		return i+j;
	}
	
	@Override
	// 뺄셈
	public int substract(int i, int j) {
		return i-j;
	}
	
	@Override
	// 곱셈
	public int times(int i, int j) {
		return i*j;
	}
	
	@Override
	// 나눗셈
	public int divide(int i, int j) {
		return i/j;
	}
	
	// @Override
	// 나머지
	//public int rest (int i, int j) {
		//return i%j;
	//}
}
