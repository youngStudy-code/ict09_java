package ch03;

public class _02_BookMain {
	public static void main(String args[]) {
		
		// 객체(인스턴스) 생성
		// 클래스명 참조변수 = new 클래스명 (); //참조변수에 클래스의 주소값
		
		// 1) 객체생성
		_02_Book bk = new _02_Book();
	
		
		// 다이렉트로 값 넣어서 진행, 보험 위험
		// 참조변수.멤버변수 = 값;
		/*
		 * bk.bookNo = 1; 
		 * bk.bookTitle = "java 입문"; 
		 * bk.author = "저자 박은종";
		 */
		
		// 2) setter로 값 전달
		// 보안으로 인한여 setter 대체문에 대신 값을 넣어 진행
		bk.setBookNo1(1);
		bk.setBookNo2(2);

		bk.setbookTitle1("java입문");
		bk.setbookTitle2("JSP");
		
		bk.setAuthor1("박은종");
		bk.setAuthor2("최범균");
		
		bk.setPrice1(25000);
		bk.setPrice2(35000);
		
		// 참조변수.멤버메소드();
		bk.showInfo();
	}
}
