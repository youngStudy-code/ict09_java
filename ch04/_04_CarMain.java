package ch04;

public class _04_CarMain {
	
	public static void main (String arg[]) {
		
		System.out.println("<<<< 디폴트 생성자 + setter >>>>");
		
		// 객체생성
		_04_Car cr = new _04_Car();
		
		// setter로 멤버변수에 값 전달
		cr.setCarNumber("볼보");
		cr.setCarBrand("XC60");
		cr.setCarPrice(6400);
		// cr.setCarColor("black");
		cr.setCarMadein("스웨덴");
		
		// getter로 바로 출력
		System.out.println("브랜드: " + cr.getCarNumber());
		System.out.println("모델: " + cr.getCarBrand());
		System.out.println("가격: " + cr.getCarPrice());
		// System.out.println("색상: : " + cr.getCarColor());
		System.out.println("made in: " + cr.getCarMadein());
		
		System.out.println("\t");
		System.out.println("<<<< 매개변수 생성자 >>>>>");
		
		// 객체 생성
		_04_Car car2 = new _04_Car("제네시스", "gv80", 5000, "한국" );
		
		// getter로 출력
		System.out.println("브랜드: " + car2.getCarNumber());
		System.out.println("모델: " + car2.getCarBrand());
		System.out.println("가격: " + car2.getCarPrice());
		// System.out.println("색상: " + car2.getCarColor());
		System.out.println("made in: " + car2.getCarMadein());
		
		System.out.println("\t");
		System.out.println("<<<< 멤버메소드 한번에 호출하기 >>>>>");
		cr.printInfo();
	}
}
