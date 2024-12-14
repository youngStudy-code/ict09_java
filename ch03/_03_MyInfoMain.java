package ch03;

public class _03_MyInfoMain {
	
	public static void main(String args[]) {
		
		// 1) 객체생성
		_03_MyInfo infoMain = new _03_MyInfo();
		
		// 2) setter 값 전달
		infoMain.setName("김태영");
		infoMain.setBirthDay("5월14일");
		infoMain.setMoney(9464183);
		infoMain.setAdddress("서울 관악구 보라매동");
		
		// 3) 멤버메소드(출력정보)
		infoMain.printInfo();
		
	}
}
