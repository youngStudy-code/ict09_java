package ch04;

//호출
public class _01_CalMain {
	public static void main (String args[]) {
	
		// 객체 생성
		// 호출 num1: 8.0 / num2: 4.0
		_01_Calculater cct = new _01_Calculater();
		
		
		// void 멤버 메소드로 호출 (자료형 무시, return 값 없음)
		// % 
		//cct.rem(8.0, 4.0);
		
		double num1 = 8.0;
		double num2 = 4.0;
		
		// 자료형에 맞는 return값 받아서 출력
		//cct.add(8.0, 4.0); // +
		double resultA = cct.add(num1,num2);
		System.out.println("add(+): " + resultA);
		
		//cct.sub(8.0, 4.0); // -
		double result2 = cct.sub(num1, num2);
		System.out.println("sub(-): " + result2);
		
		//cct.mul(8.0, 4.0); // *
		double result3 = cct.mul(num1, num2);
		System.out.println("mul(*): " + result3); 
		
		//cct.div(8.0, 4.0); // /
		double result4 = cct.div(num1, num2);	
		System.out.println("div(/): " + result4);
		
		// %
		// _01_Calculater클래스를 새로운 객체를 생성한다.
		// 생성된 새로운 객체를 cct라는 참조변수로 선언한다.
		// 선언한 _01_Calculater 자료형을 부여한다.
		
		// cct참조변수에서 rem 멤버메소드를 호출한다. 
		// _01_Calculater 클래스 파일에 rem 멤버메소드를 실행한다.
		// num1=8.0, num2=4.0 값을 각각 넣고
		// 8.0 % 4.0 = 0.0 값을 reuslt6에 담아 반환 한다.
		// resultRem에서 return값을 반환 받는다. 
		// 출력
		double resultRem = cct.rem(num1, num2);
		System.out.println("rem(%) : " + resultRem);
	}
}
