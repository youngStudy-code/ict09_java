package ch10;

//AI서비스_웹과정반 @14일차
//toString
public class _02_Book extends Object { //extends Object 생략가능, 최상단 부모는 Object
	
	String str = " ";
	
	// 멤버 메서드
	private int bookNo;
	private String bookTitle; 	
	private String author;
	private int price; 

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo; 
	}
	
	public void setbookTitle(String bookTitle) {
		 this.bookTitle = bookTitle;
	}
	
	public void setAuthor(String author) {
		 this.author = author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override // 부모(Object)메서드 재정의
	public String toString() { //toString()이 재정의 안된 경우 부모의 메서드가 호출되어서 주소값이 출력이 된다.
		
		return "번호: " + bookNo + ", " + "제목: " + bookTitle + ", " + "저자: " + author + ", " + "가격: " + price;
		
//	    str += "=== 책의 내용 =========\n";
//	    str += "책번호:\t"   +   this.bookNo + "\n";
//	    str += "제목:\t"      +   this.bookTitle + "\n";
//	    str += "저자:\t"      +   this.author + "\n";
//	    str += "가격:\t"      +   this.price + "\n";
      
  	// System.out.println(super.toString()); /* 이전 부모(Object)메서드 출력 */
    //return str;
    // return super.toString(); /* 이렇게 보내면, 주소값 출력 */
    
	}
	
//	public void showInfo(){
//		System.out.println("번호" + "\t" + bookNo + "\t" + bookNo);
//		System.out.println("제목" + "\t" + bookTitle + "\t" + bookTitle);
//		System.out.println("저자" + "\t" + author + "\t" + author);
//		System.out.println("가격" + "\t" + price + "\t" + price);
//	}
}
