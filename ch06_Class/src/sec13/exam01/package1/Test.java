package sec13.exam01.package1;

public class Test {

	public static void main(String[] args) {
		A a = new A();
//		int x = a.n; // not visible(private)
		int y = a.n2;
		a.m();
	}

}
