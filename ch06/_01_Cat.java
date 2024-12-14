package ch06;

//자식클래스인 _01_Cat는 _01_Animal를 참조한다.
public class _01_Cat extends _01_Animal {

		// 디폴트 생성자
		public _01_Cat () {
			System.out.println("<<<<_01_Cat 클래스>>>>");
		}
		
		public void cry() {
			System.out.println("야옹야옹야옹야옹야옹야옹야옹야옹");
		}	
}
