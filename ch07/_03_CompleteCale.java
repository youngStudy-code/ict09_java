package ch07;

// 자식클래스
public class _03_CompleteCale extends _03_Calculater {
	
		@Override
		public int times(int num1, int num2) {
			return num1*num2;
		}
	
		@Override
		public int divide(int num1, int num2) {
			if (num2 != 0) {
				return num1/num2;
			}
			else {
				return _03_Calc.ERROR;
			}
		}
		
		public void showInfo() {
			System.out.println("Calc 인터페이스를 구현완료~");
		}
}
