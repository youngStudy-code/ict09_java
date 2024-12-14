package ch04;

public class _03_MeMain {

	public static void main(String[] args) {
		
		// 객체생성
		_03_Me me = new _03_Me();
		
		// setter로 값전달 
		me.setName("김태영");
		me.setAge(30);
		me.setGender("여성");
		me.setHobby("먹기");
		
		// getter 출력
		System.out.println("이름:" + me.getName());
		System.out.println("나이: " + me.getAge());
		System.out.println("성별: " + me.getGender());
		System.out.println("취미: " + me.getHobby());
	}

}
