package course4;

public class Test {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
	}
	public static void main(String[] args) {
		Box<Integer> box1 = boxing(100);
		int value = box1.getT();
		System.out.println(value);
		Box<String> box2 = boxing("URECA");
		String str = box2.getT();
		System.out.println(str);

	}
	
	
}
