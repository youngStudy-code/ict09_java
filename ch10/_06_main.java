package ch10;

public class _06_main {

	public static void main(String[] args) {
		
		_06_spreadArgs spread = new _06_spreadArgs();
		spread.callArgs("치킨", "피자");
		spread.callArgs2("치킨", "피자", "스테이크", "파스타");
		spread.callArgs3("홍길동", 10,20,30,40,50,60,70);
	}
}
