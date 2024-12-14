package ch06;


// 메인
public class _06_InterFaceEx {
	public static void main(String[] args) {
		
		// method A() 호출
		A06 a06	 = new A06();
		a06.methodA();
	}
}

// 단일
class A06{
	public void methodA() {
		
		// 클래스명.static메소드
		I06 i06 = InstanceManager.getInstance();
		
		// 다양성을 적용하여 methodB() 호출
		//I06 i06 = new b05();
		i06.methodB();
	}
}

// 부모클래스
interface I06 {
	// 추상메서드
	public void methodB();
}

// 자식클래스
class B06 implements I06 {

	@Override
	public void methodB() {
		System.out.println("B06 클래스 - methodB()");
		
	}
}


class InstanceManager {
	
	/*
	 * 팩토리 메서드(factory method)
	 * - 객체를 생성하는 정적 팩토리메서드이다.
	 *    이것은 디자인 패턴의 하나로서 객체를 생성하는 부분을 자식클래스에게 위임하는 패턴이다.
	 *    즉 new 연산자를 호출하여 객체를 생성하는 코드를 자식클래스에게 위임하는 패턴이다.
	 *    사용하는 이유는 하나의 클래스가 변경되었을 경우에 다른 클래스의 변경을 최소화하기 위함이다.
	 *    
	 *    팩토리 메서드 이름으로 많이 사용하는 것은 getInstance()이다.
	 *    인터페이스에서 팩토리 메서드를 제공할 때 정적메서드를 사용하게 된다.
	 *    static이므로 클래스명.정적메서드로 접근
	 */
	
	
	
	// static은 클래스.변수명으로 받을 수 있음
	public static I06 getInstance() {
		// 팩토리 메소드
		return new B06();
	}
}
