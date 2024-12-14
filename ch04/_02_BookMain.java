package ch04;

public class _02_BookMain {
	public static void main(String args[]) {
		
		// 객체(인스턴스) 생성
		// 클래스명 참조변수 = new 클래스명 (); //참조변수에 클래스의 주소값

		// 1) 객체생성
		_02_Book bk = new _02_Book();
		
		// 2) setter로 값 전달
		bk.setBookNo(1);
		bk.setBookTitle("Java입문");
		bk.setAuthor("박은종");
		bk.setPrice(25000);
		bk.setPageCount(150);
		
		// 3)1권만 출력
		// <<멤버변수 값 출력>>
		bk.setPrintInfo();

		System.out.println();
		
		// <<getter로 값 출력>>
		bk.getBookNo();
		bk.getBookTitle();
		bk.getAuthor();
		bk.getPrice();
		bk.getPrintInfo();
	}
}
