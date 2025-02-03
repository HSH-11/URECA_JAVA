package course_2;

public class Test {

	public static void main(String[] args) {
		//메소드 파라미터에 익명 객체, 인터페이스 타입 선언 객체 생성
		Home home = new Home();
		home.use(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("익명 remote control 사용");
				
			}
			
		});

	}

}
