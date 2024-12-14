package ch04;

public class _03_Me {
	
	// getter와 setter을 쓰는 이유? 
	// private는 캡슐화 되어 있기에 직접적으로 값을 가져다 쓸 수 없다.
	// private 멤버 변수
	private String name;
	private int age;
	private String gender;
	private String hobby;
	
	// 출력은 메인에서 한다.
	// take : 값을 먼저 준다.
	public void setName(String name) {
		this.name=name;
	}
	
	// give : 값을 받는다.
	public String getName() { 
		return name;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(String gender) {
		this.gender=gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void getGender(String gender) {
		this.gender=gender;
	}
	
	public void setHobby(String hobby) {
		this.hobby=hobby;
	}
	
	public String getHobby() {
		return hobby;
	}
	
	public void getHobby(String hobby) {
		this.hobby=hobby;
	}

	// getter로 출력하는 멤버메소드 선언
//	public void getPrintInfo() {
//		System.out.println("이름: " + name);
//		System.out.println("나이: " + age);
//		System.out.println("성별: " + gender);
//		System.out.println("취미: " + hobby);	
//	}
}
