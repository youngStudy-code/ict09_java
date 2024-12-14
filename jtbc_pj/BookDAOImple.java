package jtbc_pj;

// 자식클래스
public class BookDAOImple implements BookInt {
	

	// 디폴트 생성자
	// public BookDAOImple() {}
	
	// 싱글톤
	static BookDAOImple instance = new BookDAOImple();
	
	public static BookDAOImple getInstance() {
		return instance;
	}
	
	
	// 추상 메소드 재정의, 각각 출력

	@Override
	public void bookInsert(BookDto dto) {
		System.out.println("===1.책 정보 입력===\n");
		System.out.println(dto.getBookNo());
		System.out.println(dto.getBookTitle());
		System.out.println(dto.getBookAuthor());
		System.out.println(dto.getBookPrice());		
	}
	
	@Override
	public void bookUpdate(BookDto dto) {
		System.out.println("\n===2.책 정보 업데이트===\n");
		System.out.println(dto.getBookNo());
		System.out.println(dto.getBookTitle());
		System.out.println(dto.getBookAuthor());
		System.out.println(dto.getBookPrice());		
	}

	@Override
	public void bookDelete(int bookNo) {
		System.out.println("\n===3.책 정보 삭제===\n"+ bookNo);
		
	}

	@Override
	public void bookSelect(int bookNo) {
		System.out.println("\n===4.책 정보 조회===\n"+ bookNo);
		
	}
}
