package ch07;

// p286
// 손자클래스
public class _01_MynoteBook extends _01_NoteBook {
	
	// 손자클래스에서 끝낸다로 abstract(추상) 사용X
	@Override
	public void typing() {
		System.out.println("_01_NoteBook-01_MynoteBook");
	}
}
