package ch06;

// 생성2. 부모 클래스 (공통적인 멤버변수)
public class _03_Customer {

	// 공통 멤버변수
	protected String id; // 자식한테 허용하겠다.
	private String name;    
	private String grade; 
	
	// 디폴트 생성자 (매개변수 생성자 존재로 작성해주기)
	// _03_VIPcustomer vip = new _03_VIPcustomer(); 일 경우에는 자동적으로 컴파일됨
	public _03_Customer() {}
	
	// 매개변수 생성자
	 public _03_Customer (String id, String name, String grade) {
		this.id = id;
	 	this.name = name;
	 	this.grade = grade;
	 }
	 
	// 멤버메서드 getter setter
	public void setId (String id) {
		this.id = id;
	}
	
	public String getId () {
		return id;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}

	public void setGrade (String grade) {
		this.grade = grade;
	}
	
	public String getGrade () {
		return grade;
	}
	
	public void printInfo() {
		System.out.println("고객ID: " + id);
		System.out.println("고객명: " + name);
		System.out.println("고객등급: " + grade);
	}	
}
