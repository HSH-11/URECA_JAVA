package sec01;

public class Test {

	public static void main(String[] args) {
//		//올바른 사용방법 X
//		MyIFImpl impl = new MyIFImpl();
//		MyIFImpl2 impl2 = new MyIFImpl2();
//		
//		impl.m();
//		impl2.m();
//		
//		//인터페이스 타입으로 선언, 구현한 객체 생성 할당
//		//타입 다형성
//		MyIF impl3 = new MyIFImpl();
//		MyIF impl4 = new MyIFImpl2();
//				
//		impl3.m();
//		impl4.m();
		
		//Test.java 입장에서 MyIF에만 관심
		MyIF impl = getMyIFImpl();
		impl.m();
		impl.m2();
		YourIF impl2 = getYourIFImpl();
		impl2.m2();
	}
	static MyIF getMyIFImpl() {
		return new MyIFImpl();
	}
	static YourIF getYourIFImpl() {
		return new YourIFImpl();
	}
}
