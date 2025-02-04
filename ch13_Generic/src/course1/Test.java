package course1;

public class Test {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.content = "Hello";
		
		Box<Integer> box2 = new Box<>();
		box2.content = 10;
//		box2 = "Hello"; // X
	}

}
