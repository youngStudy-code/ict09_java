package ch03;

public class _04_House {
	
	/*
	 * 클래스 = 멤버변수 (속성) + 멤버메소드 (기능,동작)
	 * 객체 = 클래스를 기반으로 만들어진 힙 메모리 공간
	 * */
	
	// 멤버변수 (속성)
	private String address; 	//강남구
	private int price; 			//가격
	private String kind; 		//아파트
	private int size; 			//평수
	
	// 멤버메서드 (기능, 동작)
	// setter (set+멤버변수: 첫글자 대문자)
	public void setAddress (String address) { //매개변수 (매게체 역활을 한다)
		this.address = address; //this.멤버변수 = 메개변수
	}
	
	public void setPrice (int price) { //매개변수 (매게체 역활을 한다)
		this.price = price; //this.멤버변수 = 메개변수
	}
	
	public void setkKind (String kind) { //매개변수 (매게체 역활을 한다)
		this.kind = kind; //this.멤버변수 = 메개변수
	}
	
	public void setSize (int size) { //매개변수 (매게체 역활을 한다)
		this.size = size; //this.멤버변수 = 메개변수
	}
	
	public void setPrintInfo() {
		System.out.println("위치: " + address);
		System.out.println("가격: " + price);
		System.out.println("아파트: " + kind);
		System.out.println("평수: " + size);
	}
	
}
