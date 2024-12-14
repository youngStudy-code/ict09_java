package mvc_book;

import java.util.Scanner;

// 메인
public class MemberBookService {

	// 메인 메소드 밖에서 사용시 static 추가
	static Scanner scan = new Scanner (System.in);
	
	// 구현 클래스 싱글톤 생성자 등록 및 instance 호출
	static BookListDAOImpl dao = BookListDAOImpl.getInstance();
	
	// 스캐너로 입력한 값 setter로 넘기기 위해 BookListDTO 생성자 호출
	static BookListDTO dto = new BookListDTO();
	
	public static void main(String[] args) {
				
		while(true) {
		
		System.out.println("* -------------------------------------------- *");
		System.out.println("* 1.도서조회   2.도서등록  3.도서삭제  4.업데이트  5.종료  *");
		System.out.println("* --------------------------------------------- *");
		System.out.printf("● 메뉴 선택 : ");
		
		int menu = scan.nextInt();
			
			switch(menu) {
				case 1 :
					bookListSelect();
					break;
					
				case 2 :
					bookListInsert();
					break;
					
				case 3 :
					bookListDelete();
					break;
					
				case 4 :
					bookListUpdate();
					break;
					
				case 5 : 
					System.out.println(" 프로그램을 종료합니다.\n");
					// break; //while 문 계속진행 
					return; //return false로 while(true) 완전 종료
					
				default : 
					System.out.println("메뉴를 다시 선택해주세요.");
			}
		}
	}
	
	//----------------1. 도서조회 bookListSelect()------------------
	
	static void bookListSelect() {
		
		System.out.print("도서 번호를 입력해주세요: ");
		BookListDTO dto = dao.bookListSelect(scan.nextInt());
		
		if (dto != null) {
			System.out.println("정상적으로 조회 완료 하였습니다.");
		} else {
			System.out.println("찾으시는 도서 정보가 없습니다.");
		}	
	}
	
	//----------------2. 도서 업데이트 bookListUpdate()------------------
	
	static void bookListUpdate() {
		
		System.out.println("업데이트 할 도서 정보를 입력해 주세요.");
		
		System.out.printf("도서NO: "); 
		dto.setBookNo(scan.nextInt());
		
		System.out.printf("도서명: "); 
		scan.nextLine(); // 버퍼 비우기
		dto.setBookname(scan.nextLine());
		
		System.out.printf("저자: ");
		dto.setBookAuthor(scan.nextLine());
		
		System.out.printf("가격: ");
		dto.setBookprice(scan.nextInt());
					
		int bookListUpdate = dao.bookListUpdate(dto);
		
		System.out.println(" ");
		System.out.println("도서NO: " + dto.getBookNo());
		System.out.println("도서명: " + dto.getBookName());
		System.out.println("저자: " + dto.getBookAuthor());
		System.out.println("가격: " + dto.getBookprice());
		
		if (bookListUpdate == 1) {
	         System.out.println("업데이트 성공: " + bookListUpdate);
	    } else {
	         System.out.println("업데이트 실패: " + bookListUpdate);
	    }
	}
	
	//----------------3. 도서 삭제 bookListDelete()------------------
	
	static void bookListDelete() {
		
		System.out.println("삭제할 도서 NO를 입력해 주세요.");
		
		System.out.printf("도서NO: "); 
		dto.setBookNo(scan.nextInt());
					
		int bookListDelete = dao.bookListDelete(dto);
		
		if (bookListDelete == 1) {
	         System.out.println("삭제 성공: " + bookListDelete);
	    } else {
	         System.out.println("삭제 실패: " + bookListDelete);
	    }	
	}
	
	//----------------4. 도서 등록 bookListInsert()------------------
	
	static void bookListInsert() {
		
		System.out.println("등록할 도서 NO를 입력해 주세요.");
		
		System.out.printf("도서NO: "); 
		dto.setBookNo(scan.nextInt());
		
		System.out.printf("도서명: "); 
		scan.nextLine();
		dto.setBookname(scan.nextLine());
		
		System.out.printf("저자: ");
		dto.setBookAuthor(scan.nextLine());
		
		System.out.printf("가격: ");
		dto.setBookprice(scan.nextInt());			
					
		int bookListInsert = dao.bookListInsert(dto);
		
		if (bookListInsert == 1) {
	         System.out.println("업로드 성공: " + bookListInsert);
	    } else {
	         System.out.println("업로드 실패: " + bookListInsert);
	    }	
	}
}