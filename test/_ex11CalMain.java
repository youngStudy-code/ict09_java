package test;

// 메인 구현
public class _ex11CalMain {

	public static void main(String[] args) {
		
		int i = 8;
		int j = 4;
		
		// 부모클래스에서 자식 클래스로 형 변환(캐스팅)
		_ex11Calc exllCalc = new _ex11_CompleteCale();
		
		// 자식클래스 4개의 메소드 호출
		exllCalc.add(i, j);
		exllCalc.substract(i, j);
		exllCalc.times(i, j);
		exllCalc.divide(i, j);
		exllCalc.rest(i, j);
		
		// 출력
		System.out.println("덧셈:" + exllCalc.add(i, j));
		System.out.println("뺄셈:" + exllCalc.substract(i, j));
		System.out.println("곱셈:" + exllCalc.times(i, j));
		System.out.println("나눗셈:" + exllCalc.divide(i, j));
		System.out.println("나머지:" + exllCalc.rest(i, j));
	}
}
