package mvc_book;

public interface BookListDAO {
	
	// 1.도서조회
	public BookListDTO bookListSelect(int bookNo);
	
	// 2.도서등록
	public int bookListInsert(BookListDTO dto);
	
	// 3.도서삭제
	public int bookListDelete(BookListDTO dto); 
	
	// 4.업데이트
	public int bookListUpdate(BookListDTO dto);
	
}
