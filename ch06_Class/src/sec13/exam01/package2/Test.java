package sec13.exam01.package2;

import sec13.exam01.package1.A;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		//System.out.println(a.n3); default(다른 패키지 불가)
		System.out.println(a.n2); //Public
		//System.out.println(a.n4); protected 같은 객체 내에서만 허용

	}

}
