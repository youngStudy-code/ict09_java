package ch09;

// 메인
public class _06_IDformatExceptionMain extends _06_IDFormatTest {

	// 메인 클래스
	public static void main(String[] args) {
		
		_06_IDformatExceptionMain test = new _06_IDformatExceptionMain();
		
		String userID = null;
		
		try {
			// setUserID (null)값을 넘긴다.
			test.setUserID(userID);
		// 오류일때 실행
		} catch(_06_IDformatException e) {
			System.out.println(e.getMessage());
		}
		
		userID = "1234567";
		
		try {
			// 값 1234567를 setUserID로 넘긴다.
			test.setUserID(userID);
		// 오류일때 실행
		} catch(_06_IDformatException e) {
			System.out.println(e.getMessage());
		}
	}
}
