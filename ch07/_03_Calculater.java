package ch07;

// 부모클래스
public abstract class _03_Calculater implements _03_Calc  {

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int substact(int num1, int num2) {
		return num1-num2;
	}

//	@Override
//	public int times(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int divide(int num1, int num2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현완료~");
	}
}
