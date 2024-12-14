package ch06;

public class _04_main {
	
	public static void main (String[] args) {
		
		System.out.println("<<<각자 new생성 및 호출>>>");
	
		// 자식클래스 참조변수 = new 자식클래스();
		// 부모클래스_1 호출
		_04_Animal a = new _04_Animal(); 
		a.move(); // 동물이 움직입니다.
		
		// 자식클래스_1 호출 
		_04_Human human = new _04_Human();
		human.move(); // 사람이 움직입니다.
		human.readBook();
		
		// 자식클래스_2 호출
		_04_tiger tiger = new _04_tiger();
		tiger.move(); // 호랑이가 네발로 뜁니다.	
		
		_04_Eagle eagle = new _04_Eagle();
		eagle.move(); // 독수리가 하늘을 납니다.
		
		_04_Fish fish = new _04_Fish();
		fish.move();
		
		//-----------------------------------------------
		
		// 다양성은 매개변수로 통해 호출할때 효율적이다.
		System.out.println("<<<다양성 적용>>>");
		
		// 부모클래스 참조변수 = new 자식클래스();
		// human 자식클래스(animal을 상속)를 _04_Animal 부모 클래스에 값에 넣는다.
		_04_Animal aniHuman = new _04_Human(); 
		// 오버라이딩
		aniHuman.move(); //사람이 움직입니다.
		
		// 다운 캐스팅: _04_Animal 부모클래스를 _04_Human 자식클래스로 
		// 명시적(강제적) 형 변환
		_04_Human hm = (_04_Human)aniHuman;
		hm.readBook();
		
		_04_Animal aniEagle = new _04_Eagle(); 
		aniEagle.move();
		
		_04_Animal aniTiger = new _04_tiger(); 
		aniTiger.move();
		
		_04_Animal anFish = new _04_Fish();
		anFish.move();
		
		
		// 메소드 1개로 _04_Animal 부모타입에 
		System.out.println("<<<매개변수를 통한 다양성 적용>>>");	
		animalMove(new _04_Human()); // animal.move(); = new _04_Human()
		animalMove(new _04_Eagle());
		animalMove(new _04_tiger());
		animalMove(new _04_Fish());
		
	} //main
	
	// 부모타입 참조변수 = _04_Human 자식 클래스로 받는다.
	// _04_Animal animal = animalMove(new _04_Human());
	//_04_Animal aniHuman: 부모의 참조변수
	//public static void animalMove(_04_Animal animal) {
		//animal.move();
	//}
	
	
	// 다양성, 다운 캐스팅 
	// instanceof: 실제 타입을 알아보기
	public static void animalMove(_04_Animal animal) {
		
		if(animal instanceof _04_Human) {
			_04_Human hm = (_04_Human)animal;
			hm.readBook();
		} else if(animal instanceof _04_Eagle) {
			_04_Eagle eg = (_04_Eagle) animal;
			eg.flying();
		} else if (animal instanceof _04_Fish) {
			_04_Fish fish = (_04_Fish) animal;
			fish.eat();
		}
	}
}
