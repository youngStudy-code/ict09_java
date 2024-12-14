package mvc_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// 인스턴스 추상 메소드 구현
public class _02_MemberDAOImpl implements _02_MemberDAO {
	
	// 디폴트 생성자
	public _02_MemberDAOImpl() {
		System.out.println("<<<<디폴트생성자>>>>");
	}
	
	
	// 싱글톤 객체생성
	static _02_MemberDAOImpl instance = new _02_MemberDAOImpl();
	
	
	public static _02_MemberDAOImpl getInstance() {
		if(instance == null) {
			instance = new _02_MemberDAOImpl();
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
	
	
	// 로그인
	@Override
	public int login(_02_MemberDTO dto) {
		
		System.out.println ("[로그인]");
		
		int loginCnt = 0;
		
		String query = "SELECT * FROM jtbc_member_tbl "
				+ "WHERE id = ? "
				+ "AND password = ?";
				
		try {
			
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);	
		
			pstmt = conn.prepareStatement(query);							
			
			pstmt.setString(1, dto.getId());							
			pstmt.setString(2, dto.getPassword());

			loginCnt = pstmt.executeUpdate();									
			//System.out.println("loginCnt:  " + loginCnt);
			
		} catch(SQLException e) {
			e.printStackTrace(); 
		} finally {
			
			try {
				if(pstmt != null) pstmt.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return loginCnt;
	}
		

	
	//회원가입 성공
	@Override
	public int memberInsert(_02_MemberDTO dto) {
		
		System.out.println ("[회원가입]");
		
		int insertCnt = 0;
		
		String query = "INSERT INTO jtbc_member_tbl (id, password, gender, email, address) " 	
				+ "VALUES (?, ?, ?, ?, ?)";
		
		try {
			
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);	
			
			pstmt = conn.prepareStatement(query);							
			
			pstmt.setString(1, dto.getId());								
			pstmt.setString(2, dto.getPassword());
			pstmt.setString(3, dto.getGender());
			pstmt.setString(4, dto.getEmail());
			pstmt.setString(5, dto.getAddress());

			insertCnt = pstmt.executeUpdate();									
			System.out.println("insertCnt:  " + insertCnt);
			
		} catch(SQLException e) {
			e.printStackTrace(); 
		} finally {
			
			try {
				if(pstmt != null) pstmt.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return insertCnt;
	}
	
	
	// 회원수정
	@Override
	public int memberUpdate(_02_MemberDTO dto) {
		
		System.out.println ("[회원수정]");
		
		int updateCnt = 0;
		
		String query = "UPDATE jtbc_member_tbl "
				+ "SET password = ? "
			    + ", gender = ? "
			    + ", email = ? "
			    + ", address = ? "
				+ "WHERE id = ?"; 
		
		try {
			conn = DriverManager.getConnection (dbURL, dbID, dbPassword);
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, dto.getPassword());
			pstmt.setString(2, dto.getGender());
			pstmt.setString(3, dto.getEmail());
			pstmt.setString(4, dto.getAddress());
			pstmt.setString(5, dto.getId());
			
			updateCnt = pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace(); 
		} finally {
			
			try {
				if(pstmt != null) pstmt.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return updateCnt;
	}
	
	
	// 회원삭제 성공
	@Override
	public int memberDelete(_02_MemberDTO dto) {
	
		System.out.println ("[회원삭제]");
		
		int deleteCnt = 0;
		
		String query = "DELETE FROM jtbc_member_tbl "
				+ "WHERE id = ?";
		
		try {

			conn = DriverManager.getConnection (dbURL, dbID, dbPassword);

			pstmt = conn.prepareStatement(query);

			pstmt.setString(1, dto.getId());

			deleteCnt = pstmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace(); 
		} finally {
			
			try {
				if(pstmt != null) pstmt.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return deleteCnt;
	}
	
	
	// 회원 조회
	@Override
	public _02_MemberDTO memberSelect(String id) {
		
		// _02_MemberDTO dto = null;
		
		System.out.println("[회원조회]");
		
		String query = "SELECT * FROM jtbc_member_tbl "
				+ "WHERE id = ?";
		
		_02_MemberDTO dto = new _02_MemberDTO();
		
		try {	
			conn = DriverManager.getConnection (dbURL, dbID, dbPassword);
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { 
				dto.setId(rs.getString("ID"));
				dto.setPassword(rs.getString("PASSWORD"));
				dto.setGender(rs.getString("GENDER"));
				dto.setEmail(rs.getString("EMAIL"));
				dto.setAddress(rs.getString("ADDRESS"));
			}		
		} catch(SQLException e) {
			e.printStackTrace(); 
		} finally {
			try {
				if(pstmt != null) pstmt.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
}