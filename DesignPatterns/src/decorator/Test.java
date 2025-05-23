package decorator;

public class Test {

	public static void main(String[] args) {
		// Truck (CarOne)
		Car carOne = new CarOne();
		System.out.println(carOne.getDesc() + " " + carOne.getSpeed());
		Car carTwo = new CarTwo();
		System.out.println(carTwo.getDesc() + " " + carTwo.getSpeed());
		
		// 상속 대신 객체 전달
		Car truckOne = new Truck(carOne);
		System.out.println(truckOne.getDesc() + " " + truckOne.getSpeed());
		
		// 만약 Truck이 CarOne 또는 CarTwo를 상속받았더라면 위와 같은 코드를 수행 X
		// Decorator 패턴을 적용하면 CarOne과 CarTwo가 마치 상속 받은 것처럼 작용
		
	}

}
