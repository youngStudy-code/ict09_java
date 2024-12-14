package mvc_book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 인터페이스 구현
public class BookListDAOImpl implements BookListDAO{
	
	// 디폴트 생성자
	public BookListDAOImpl() {}
	
	// 싱글톤 생성자
	static BookListDAOImpl instance = new BookListDAOImpl();
	
	public static BookListDAOImpl getInstance() {
		if(instance == null) {
			instance = new BookListDAOImpl();
		}
			return instance;
	}
	
	// DB연결 (공통코드)
	String dbURL = "jdbc:oracle:thin:@localhost:1521:xe"; 	// @HOST:PORT:SID
	String dbID = "scott_04"; 								// 계정
	String dbPassword = "tiger"; 							// 비밀번호
	
	Connection conn = null; 								// 오라클 연결
	PreparedStatement pstmt = null;							// SQL 문장
	ResultSet rs = null;									// SQL 실행결과 (SELECT)
	
	
	// 1. 도서조회
	@Override
	public BookListDTO bookListSelect(int bookNo){
		
		System.out.println("[" + bookNo + "번 도서 조회 결과 입니다.]");
		
		String query = "SELECT * FROM book_tbl "
				+ "WHERE bookno = ?";
		
		BookListDTO dto = new BookListDTO();
		
		try {
			
			conn = DriverManager.getConnection (dbURL, dbID, dbPassword);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, bookNo);
			// 오류 pstmt.setInt(1, dto.getBookNo());
			
			// SELECT 쿼리 문 실행 후 결과를 rs에 저장
			rs = pstmt.executeQuery();
			
			// 1개의 행씩 비교하여 값을 찾아라
			if(rs.next()) {
				dto.setBookNo(rs.getInt("bookNo")); 
				dto.setBookname(rs.getString("bookname"));
				dto.setBookAuthor(rs.getString("bookauthor"));
				dto.setBookprice(rs.getInt("bookprice"));
				
				System.out.println("도서명: " + dto.getBookName()); 
				System.out.println("도서 저자: " +dto.getBookAuthor());
				System.out.println("도서 가격: " +dto.getBookprice());

				
			}	

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}	
		}
	
		return dto;
	}
	

	// 2. 도서등록
	@Override
	public int bookListUpdate(BookListDTO dto) {
		
		int bookListUpdate = 0;
		
		System.out.println(" ");
		System.out.println("[도서 업로드]");
		
		String query = "UPDATE book_tbl "
				+ "SET bookname = ? "
				+ ", bookauthor = ? "
				+ ", bookprice = ? "
				+ "WHERE bookNo = ?";
		
		try {
			
			conn = DriverManager.getConnection (dbURL, dbID, dbPassword);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, dto.getBookName());
			pstmt.setString(2, dto.getBookAuthor());
			pstmt.setInt(3, dto.getBookprice());
			pstmt.setInt(4, dto.getBookNo());
				
			bookListUpdate = pstmt.executeUpdate();

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}	
		}
		return bookListUpdate;
	}
	
	
	// 3. 도서삭제
	@Override
	public int bookListDelete(BookListDTO dto) {
		
		int bookListDelete = 0;
		
		System.out.println(" ");
		System.out.println("[도서 삭제]");
		
		String query = "DELETE from book_tbl WHERE bookno = ? ";
		
		try {
			
			conn = DriverManager.getConnection (dbURL, dbID, dbPassword);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, dto.getBookNo());
				
			bookListDelete = pstmt.executeUpdate();

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}	
		}
		return bookListDelete;
	}
	
	// 4. 도서추가
	@Override
	public int bookListInsert(BookListDTO dto) {
		
		int bookListInsert = 0;
		
		System.out.println(" ");
		System.out.println("[도서 신규 등록]");
		
		String query = "INSERT INTO book_tbl  "
				+ "(bookNo, bookname, bookauthor, bookprice) "
				+ "VALUES (?, ?, ?, ?)";
		
		try {
			
			conn = DriverManager.getConnection (dbURL, dbID, dbPassword);
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, dto.getBookNo());
			pstmt.setString(2, dto.getBookName());
			pstmt.setString(3, dto.getBookAuthor());
			pstmt.setInt(4, dto.getBookprice());
				
			bookListInsert = pstmt.executeUpdate();

		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}	
		}
		return bookListInsert;
	}
}
