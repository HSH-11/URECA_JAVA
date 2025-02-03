package course_1;

public class Car {
	private Tire tire1 = new Tire();
	private Tire tire2 = new Tire(){
		@Override
		public void roll() {
			System.out.println("익명 타이어가 굴러간다.");
		}
	};
	
	public void run() {
		tire1.roll();
		tire2.roll();
	}
}
