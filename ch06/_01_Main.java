package ch06;

public class _01_Main {

	public static void main(String[] args) {
		
		// dog 출력
		System.out.println("<<<Dog 객체생성 + setter 멤버변수에 값 전달>>>");
		_01_dog dog01 = new _01_dog();
		
		dog01.setKind("강아지");
		dog01.setLengs(4);
		dog01.setWeight(5);
		
		dog01.PrintInfo();
		dog01.bark();
		
		System.out.println();
		
		// cat 출력
		System.out.println("<<<cat 객체생성 + setter 멤버변수에 값 전달>>>");
		_01_Cat cat01 = new _01_Cat();
		
		_01_Animal amimal = (_01_Animal)cat01;
		
		System.out.println("55555555555555555555");
		amimal.setKind("dsfdf");
		amimal.PrintInfo();
		
		cat01.setKind("고양이");
		cat01.setLengs(4);
		cat01.setWeight(5);
		
		cat01.PrintInfo();
		cat01.cry();
	}
}
