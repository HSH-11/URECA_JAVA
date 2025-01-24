package methodpoly;

public class Test2 {

	public static void main(String[] args) {
//		A obj1 = new A();
//		obj1.a(); // 출력: "A - a()"
//		
//		B obj2 = new B();
//		obj2.a();        // 출력: "A - a()" (B에서 오버라이딩하지 않았기 때문)
//		obj2.a(10);      // 출력: "B - a(int i)"
//		obj2.b();        // 출력: "B - b()"
//		
//		C obj3 = new C();
//		obj3.a();        // 출력: "C - a()"
//		obj3.b();        // 출력: "B - b()" (C에서 b()를 오버라이딩하지 않았기 때문)
//		obj3.c();        // 출력: "C - c()"
//		
//		D obj4 = new D();
//		obj4.a();        // 출력: "D - a(int i)"
//		obj4.b();        // 출력: "D - b()"
//		obj4.c();        // 출력: "C - c()"
//		obj4.d();        // 출력: "D - d()"
//		
//		A obj5 = new D(); // D 객체를 A 타입으로 참조
//		obj5.a();         // 출력: "D - a(int i)" (동적 바인딩으로 실제 객체의 메서드 호출)
//		//obj5.b();         // 오류: A 타입에는 b() 메서드가 정의되어 있지 않음 따라서 인스턴스 메소드에 있는 b()에 접근 불가
//	
//	
//		//Overriding 호출 관계
//		B x = new C();
//		x.a(); //A클래스의 메소드를 오버라이딩
//		//x.c();
//		
//		C y = new D();
//		y.b();//
//		y.a(10);
	
		A x = new C();
		//하위 클래스 부터 적용
		if (x instanceof D){
			System.out.println("D 객체");	
		}else if(x instanceof C){
			System.out.println("C 객체");
		}else if(x instanceof B){
			System.out.println("B 객체");
		}else if(x instanceof A){
			System.out.println("A 객체");
		}
		//결과 C객체
	}
}
