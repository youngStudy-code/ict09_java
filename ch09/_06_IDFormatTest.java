package ch09;

// 설계 (set-get)
public class _06_IDFormatTest {
	
	// this.userID 값을 받는다.
	private String userID;

	// setUserID (null, 1234567)값을 받아 
	public void setUserID (String userID) throws _06_IDformatException {
		
		// userID가 null 이면 실행
		if(userID == null) {
			// _06_IDformatException 클래스에 메시지 값을 던진다.
			throw new _06_IDformatException ("아이디는 null일 수 없습니다.");
		}
		// userID길이가 8자 이하, 20자 이상일 경우 실행한다.
		else if(userID.length() <8 || userID.length()>20) {
			throw new _06_IDformatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		// userID에 값을 넘긴다.
		this.userID = userID;
	}
	 
	// get
	// userID를 받아 get으로 넘긴다.
	public String getUserID(){
		return userID;
	}
} 