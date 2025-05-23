package proxy;

public class ProxyCar implements Car {

//	private Car car = new SimpleCar();
//
//	@Override
//	public void engineStart() {
//		System.out.println("Proxy Car Engine Start");
//		car.engineStart();
//	}
//
//	@Override
//	public void drive() {
//		System.out.println("Proxy Car Drive");
//		car.drive();
//
//	}
	
	// Lazy Loading
	private Car car;

	@Override
	public void engineStart() {
		System.out.println("Proxy Car Engine Start");
//		car.engineStart();
	}

	@Override
	public void drive() {
		System.out.println("Proxy Car Drive");
//		car.drive();
		
		if (car == null) {
			car = new SimpleCar();
			car.engineStart();
		}
		car.drive();

	}

}
