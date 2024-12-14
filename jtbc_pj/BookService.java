package jtbc_pj;

// 메인
public class BookService {

	public static void main(String[] args) {
		
		// 첫번째 값 입력 
		BookDto dto = new BookDto(); 
		
		dto.setBookNo(1);
		dto.setBookTitle("헨젤과 그레텔");
		dto.setBookAuthor("david");
		dto.setBookPrice(6500);
		
		
		// 다형성, 싱글톤 호출
		BookInt bookInt = BookDAOImple.getInstance();
		
		
		// 첫번째 값 각 메서드 호출 (자식메서드 호출)
		bookInt.bookInsert(dto);
		bookInt.bookUpdate(dto);
		bookInt.bookDelete(dto.getBookNo());
		bookInt.bookSelect(dto.getBookNo());
		
		
		// 두번째 값 입력
		dto.setBookNo(2);
		dto.setBookTitle("신데렐라");
		dto.setBookAuthor("aria");
		dto.setBookPrice(9900);
		
		// 첫번째 값 각 메서드 호출 (자식메서드 호출)
		bookInt.bookInsert(dto);
		bookInt.bookUpdate(dto);
		bookInt.bookDelete(dto.getBookNo());
		bookInt.bookSelect(dto.getBookNo());
		
	}

}
