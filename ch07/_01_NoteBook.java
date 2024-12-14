package ch07;

//p286
//자식클래스_2 - 추상메서드를 모두 구현 했으므로 일반클래스
public abstract class _01_NoteBook extends _01_Computer {

	@Override
	public void display() {
		System.out.println("_01_NoteBook - display()");
	}

	// 해결안한 추상 메소드로 인해 클래스 자체를 추상 클래스로 변환
//	@Override
//	public  void typing() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
