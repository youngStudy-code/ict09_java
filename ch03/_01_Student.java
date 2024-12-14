package ch03;

//책에 없는 내용
// 설계도
public class _01_Student {
	
	/*
	 * 클래스: 객체에 대한 설계도, 디자인
	 * - 멤버변수(속성) + 멤버메서드 (기능, 동작)
	 * 객체: 클래스를 바탕으로 만들어진 힙메모리 공간
	 */

	// 멤버변수 (속성)
	String sudentID; // 학번 S001
	String name; // 이름 아이유
	String email; // 이메일 iu@naver.com
	String address; // 주소 Manhattan
	
	// 멤버 메서드(기능, 동작)
	// main메소드만 class 지정, 바로 void로 작성
	public void printerInfo(){
		// 멤버변수 정보 출력
		System.out.println("학번:" + sudentID );
		System.out.println("이름:" + name );
		System.out.println("이메일:" + email );
		System.out.println("주소: " + address);
	}
}
