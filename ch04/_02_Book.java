package ch04;

public class _02_Book {
	
	// 번호 
	private int bookNo1;
	private int bookNo2;
	
	// 제목 
	private String bookTitle1; 	
	private String bookTitle2; 	
	
	// 저자 
	private String author1; 
	private String author2; 
	
	// 가격 
	private int price1; 
	private int price2; 
	
	// 페이지수
	private int pageCount1;
	private int pageCount2;
	
	
	public void setBookNo(int bookNo1) {
		this.bookNo1 = bookNo1;
	}
	
	public void setBookTitle(String bookTitle1) {
		this.bookTitle1 = bookTitle1;
	}
	
	public void setAuthor(String author1) {
		this.author1 = author1;
	}
	
	public void setPrice(int price1) {
		this.price1 = price1;
	}
	
	public void setPageCount(int pageCount1) {
		this.pageCount1 = pageCount1;
	}
	
	// getter 멤버메소드 값 대입
	public int getBookNo() {
		bookNo2 = 2;
		return bookNo2;
	}
	
	public String getBookTitle() {
		bookTitle2 = "JSP";
		return bookTitle2;
	}
	
	public String getAuthor() {
		author2 = "최범균";
		return author2;
	}
	
	public int getPrice() {
		price2 = 35000;
		return price2;
	}
	
	public void setPrintInfo() {
		System.out.println("번호\t" + bookNo1);
		System.out.println("제목\t" + bookTitle1);
		System.out.println("저자\t" + author1);
		System.out.println("가격\t" + price1);
		System.out.println("페이지수\t" + pageCount1);
	}
	
	// getter 멤버메소드 호출
	public void getPrintInfo() {
		System.out.println("번호\t" + bookNo2);
		System.out.println("제목\t" + bookTitle2);
		System.out.println("저자\t" + author2);
		System.out.println("가격\t" + price2);
	}
}
