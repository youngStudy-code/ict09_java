package ch03;

public class _02_Book {
	
	/*
	 * 클래스: 객체에 대한 설계도, 디자인
	 * - 멤버변수(속성) + 멤버메서드 (기능, 동작)
	 * 객체: 클래스를 바탕으로 만들어진 힙메모리 공간
	 */
	
	// 멤버변수 (속성)
	// private 보안 함수 
	
	// 번호 1 2
	private int bookNo1;
	private int bookNo2;
	
	// 제목 java입문 JSP
	private String bookTitle1; 	
	private String bookTitle2;
	
	// 저자 박은종 최범균
	private String author1; 
	private String author2;
	
	// 가격 25000 35000
	private int price1; 
	private int price2; 

	// 3)매게 변수로 값 전달 받는다.
	// setter 멤버 메소드 (기능, 동작)
	public void setBookNo1(int bookNo1) {
		this.bookNo1 = bookNo1; // 4) 멤버변수로 대입 = 매게변수
	}
	
	public void setBookNo2 (int bookNo2) {
		this.bookNo2 = bookNo2;
	}
	
	// 멤버 메소드 (기능, 동작)
	public void setbookTitle1(String bookTitle1) {
		 this.bookTitle1 = bookTitle1;
	}
	
	public void setbookTitle2(String bookTitle2) {
		this.bookTitle2 = bookTitle2;
	}
	
	// 멤버 메소드 (기능, 동작)
	public void setAuthor1(String author1) {
		 this.author1 = author1;
	}
	
	public void setAuthor2(String author2) {
		 this.author2 = author2;
	}
	
	// 멤버 메소드 (기능, 동작) 
	public void setPrice1(int price1) {
		this.price1 = price1;
	}
	
	public void setPrice2(int price2) {
		this.price2 = price2;
	}
	
	// 멤버메소드(기능, 동작)
	public void showInfo(){
		System.out.println("번호" + "\t" + bookNo1 + "\t" + bookNo2);
		System.out.println("제목" + "\t" + bookTitle1 + "\t" + bookTitle2);
		System.out.println("저자" + "\t" + author1 + "\t" + author2);
		System.out.println("가격" + "\t" + price1 + "\t" + price2);
	}
}
