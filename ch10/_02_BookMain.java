package ch10;

// AI서비스_웹과정반 @14일차
// toString
public class _02_BookMain {
	public static void main(String args[]) {
		
		_02_Book book1 = new _02_Book();
		
		book1.setBookNo(1);
		book1.setbookTitle("java입문");
		book1.setAuthor("박은종");
		book1.setPrice(25000);
		
		// book1.toString();
		// toString()이 재정의 안된 경우 => 부모의 메서드가 호출되어 주소값 출력 
		// 예) ch10._02_Book@6f2b958e
		// toString()이 재정의 된 경우 => 재정의된 자식메서드가 호출 
		System.out.println(book1.toString());
		//System.out.println(book1);[

	}
}
