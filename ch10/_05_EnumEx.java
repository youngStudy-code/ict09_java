package ch10;


// Enum은 상수 값 중 비슷한 것들을 묶어두는 역할을 하는 자료형입니다.
enum Animal {CAT, DOG, FISH}

	//AI서비스_웹과정반 @14일차
	public class _05_EnumEx {
		
		/*
	    * enum : 열거형
	    * 1. 정의 : 여러개의 상수들을 모아서 만든 객체를 의미한다.
	    * 2. 작성방법 : enum 열거형명 {상수1, 상수2, .. 상수n}
	    * 3. 용도 : 제한된 상수값만을 사용하고자 할때
	    * 4. 접근방법 : 열거형명.상수
	    *    접근방법 : 열거형명.상수.ordinal() => index
	    * 5. 특징 : switch(변수/수식)에서 변수타입으로 enum을 사용할 수 있다.  
	    *         ordinal() 메서드를 이용해서 순서값을 얻어올 수 있다.
	    *         ordinal() 메서드는 0부터 시작한다.
	    */	
	
		// 멤버변수
		private Animal kind; // Animal 자료형
		private String name; // 이름
	
		
		// 디폴트 생성자
		public _05_EnumEx(){}
	
		
		// 매개변수 생성자 
		public _05_EnumEx (Animal kind, String name) {
			this.kind = kind;
			this.name = name;
		}

		
		// set-get
		public Animal getKind() {
			return kind;
			
		}
		
		public void setKind(Animal kind) {
			this.kind = kind;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return (kind + ":" + name);
		}
	}