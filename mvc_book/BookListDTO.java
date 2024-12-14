package mvc_book;

//getter, setter
public class BookListDTO {
	
	private int bookNo;
	private String bookName;
	private String bookAuthor;
	private int bookPrice;
	
	public int getBookNo() {
		return bookNo;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	} 
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookname(String bookName) {
		this.bookName = bookName;
	}
	
	public String getBookAuthor() {
		return bookAuthor;
	}
	
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	
	public int getBookprice() {
		return bookPrice;
	}
	
	public void setBookprice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
}
