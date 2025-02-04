package course5;

public class Test {

	public static void main(String[] args) {
		System.out.println(compare(10, 20));
		System.out.println(compare(10.5, 20.4));
//		System.out.println(compare("Hello","World")); 
		// 모든 사람 가능
		Course.registerCourse1(new Applicant<Person>(new Person()));
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();

		// 학생만 가능
		// Course.registerCourse2(new Applicant<Person>(new Person())); 
		// Course.registerCourse2(new Applicant<Worker>(new Worker())); 
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		System.out.println();

		// 직장인,일반인만 가능
		Course.registerCourse3(new Applicant<Person>(new Person()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		// Course.registerCourse3(new Applicant<Student>(new Student())); 
		// Course.registerCourse3(new Applicant<HighStudent>(new HighStudent())); 
		// Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
	}

//	제한된 타입 파라미터
//	T는 모든 타입의 객체가 아닌 Number를 포함한 Number의 하위 클래스로 제한
	public static <T extends Number> boolean compare(T t1, T t2) {
		return t1.doubleValue() == t2.doubleValue();
	}
	// 제한된 타입은 super를 사용할 수 없다.
//	public static <T super Number> boolean compare(T t1, T t2) {
//		return t1.doubleValue() == t2.doubleValue();
//	}
//	와일드카드 타입 파라미터

}
