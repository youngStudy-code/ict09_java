package ch07;

// p315 - 인터페이스 - 부모
public interface _03_Calc {
	
	// 상수 - 컴파일 과정에서 public static final 추가
	// 대문자로 쓴 이유는 일반 변수와 구분하겠다. 가독성
	double PI = 3.14;
	int ERROR = -9999;
	
	
	// 추상메서드 - 컴파일 과정에서 public abstract 추가
	int add (int num1, int num2);
	int substact (int num1, int num2);
	
	// @Override
	// 추상클래스
	int times (int num1, int num2);
	int divide (int num1, int num2);
	
	void showInfo();
	
}
