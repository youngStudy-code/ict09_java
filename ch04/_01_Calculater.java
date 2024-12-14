package ch04;

//구현-결과result
public class _01_Calculater {
	
		/*
	    * 메서드(함수) : 클래스의 기능 구현
	    * - 입력을 받아 처리 결과를 반환하는 기능
	    * 
	    * 1) 메서드 호출시 메서드명이 일치해야 한다.
	    * 2) 호출하는 매개변수 갯수와 type(자료형)이 일치해야 한다.
	    * 3) 리턴타입도 일치해야 한다.
	    *    단, 변수명은 달라도 무관
	    * 4) return문 아래는 어떤 문장도 올 수 없다. (값을 반환하겠다. final)
	    *  
	    * 문법 : public 반환형 메서드명(매개변수1,..) {
	    *           return 반환값;   // 처리결과를 리턴하며, 반환형과 일치해야 한다.
	    *    }
	    *    반환형이 void(비어있다는 뜻)으로 선언된 메서드는 결과값을 반환하지 않는다.
	    */
	
		// 멤버메소드
		// void는 값 반환을 하지 않겠다. (자료형으로 반환 무시) 
		// %
		/*
		 * public void rem (double num1, double num2) { double result5 = num1 % num2;
		 * System.out.println("rem(%): " + result5); }
		 */
		
		// +
		// 매개변수에 맞는 자료형으로 반환해주기
		public static double add(double num1, double num2) {
			double result1 = num1+num2;
			return result1;
			// return문 아래 문장이 오면 오류발생, 왜? return = final의 의미
			//System.out.println("add(+): " + result1);
		}
		
		// -
		public static double sub(double num1, double num2){
			 //double result2 = num1 - num2;
			 //return result2;
			 
			//return문 한 문장으로 끝내기
			return num1 - num2;
			// System.out.println("sub(-): " + result2);
		}
		
		// *
		public static double mul(double num1, double num2){
			double result3 = num1 * num2;
			return result3;
			// System.out.println("mul(*): "  + result3);
		}
		
		// /
		public static double div(double num1, double num2){
			 double result4 = num1 / num2;
			 return result4;
			 // System.out.println("div(/): " + result4);
		}
		
		// %
		public static double rem(double num1, double num2){
			double result6 = num1 % num2;
			return result6;
		}
}
