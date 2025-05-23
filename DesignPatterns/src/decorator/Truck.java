package decorator;

public class Truck extends CarDecorator {

	public Truck(Car car) {
		super(car);
	}

	// 생성자에 전달된 Car 인터페이스를 구현한 객체의 메소드를 그대로 쓰려면 재정의 안하면 된다.

	@Override
	public String getDesc() {
		return super.getDesc();
	}

	@Override
	public int getSpeed() {
		return super.getSpeed() - 20;
	}

}
