package ch06;

public class _01_customerMain {
	 
	public static void main(String[] args) {
		
		// 생성자1
		 _01_customer ct = new  _01_customer();
		
		// getter 출력
		System.out.println("<<< 객체생성 (디폴트 생성자) +  setter -> 멤버변수 >>>");
		System.out.println(" ");
		
		ct.setCustomerID("C001");
		ct.setCustomerName("김태희");
		ct.setBonusPoint(10);
		ct.setBonusRate(0.05);
		
		
		
		// 생성자2
		// 클래스 인스턴스 = new생성자 클래스(참조값)
		_01_customer ct1 = new _01_customer ("C002", "비", 5, 0.03);
		
		// 참조변수.멤버메소드
		ct.printInfo();
		System.out.println(" ");
		ct1.printInfo1("C002", "비", 5, 0.03);
	
	}
}
