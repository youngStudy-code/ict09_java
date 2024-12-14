package jtbc_pj;

// setter ,getter
public class BookDto {
	
	// 멤버 변수
	int bookNo;
	String bookTitle;
	String bookAuthor;
	int bookPrice;
	
	
	// getter, setter
	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public int getBookPrice() {
		return bookPrice;
	}
		
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
}
