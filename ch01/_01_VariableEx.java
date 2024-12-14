package ch01;

//클래스명은 대문자로 시작한다.
//메소드명은 소문자로 시작한다.
public class _01_VariableEx {
	/*
	 * 자바프로그램의 첫 시작을 나타내는 main() 메소드 .. 소문자로 시작한다.
	 * 자바가상머신 (JVM, JAVA Virtual Machine)이 프로그램을 시작하기 위해 호출하는 메소드
	 */
	public static void main(String[] args) {
		System.out.println("*** 변수 ***");
		System.out.println("변수 : 하나의 값을 저장할 수 있는 메모리 공간");
		
		/*
		 * 변수 선언 및 대입 => 자료형 변수명 = 값;
		 * 변수는 소문자로 시작한다. 
		 */
		
		System.out.println("*** 나의 정보 ***");
		
		// 좋아하는 숫자
		int favorite = 6; 
		System.out.println("좋아하는 숫자: " + favorite);
		
		// 이름
		String name = "김태영";
		System.out.println("이름: " + name);
		
		// 주소
		String address = "서울시 관악구";
		System.out.println("주소: "+ address);
		
		// 꿈
		String dream = "고액 연봉 개발자"; //String: 긴 문자열
		System.out.println("꿈: " + dream);
		
		// 혈액형
		char bloodType = 'B';  //char: 1개의 문자
		System.out.println("혈액형: " + bloodType);
		
		System.out.println("-------------------");
		// \t => 탭, \n => 줄바꿈 
		System.out.println("좋아하는 숫자: " + favorite + "\t이름: " + name + "\t주소: " + address + "\t꿈: " + dream + "\t혈액형: " + bloodType);
		System.out.println("좋아하는 숫자: " + favorite + "\n이름: " + name + "\n주소: " + address + "\n꿈: " + dream + "\n혈액형: " + bloodType);	
		
		String dream1 = "백수";
		System.out.println("과거의 꿈:" + dream1);
		
		dream1 = "고액 연봉자";
		System.out.println("현재의 꿈:" + dream1);
		
	}
}

