package ch09;

// P506
// 사용자 정의 Exception - Exception을 상속받아야 한다.
// 예외일 경우 호출되는 클래스 (서버 멈춤 현상을 위해 예외 상속 클래스 선언)
public class _06_IDformatException extends Exception {
	
	// 3. 매개변수 생성자
	// throw new _06_IDformatException ("아이디는 null일 수 없습니다.");
	// throw new _06_IDformatException("아이디는 8자 이상 20자 이하로 쓰세요.");
	public _06_IDformatException (String message) {
		super (message); // 부모 (=Exception) 매개변수 생성자 호출
	}
	
	/*
	 *  public Exception(String message){
        	super (message);
        }
	 * 
	 * */
}
