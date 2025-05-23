package proxy;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {

//		Car car = new SimpleCar();
//		car.engineStart();
//		
//		try {
//			Thread.sleep(3000);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		car.drive();

		// Lazy loading이 되는 지 알 수 없다.
//		Car car = new ProxyCar();
//		car.engineStart();
//		
//		try {
//			Thread.sleep(3000);
//		}catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		car.drive();
		
		// 동적으로 생성하는 Proxy
		Car car = getCar();
		car.engineStart();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		car.drive();

	}
	static Car getCar() {
		Car car = new SimpleCar();
		
		//reflection api
		return (Car) Proxy.newProxyInstance(SimpleCar.class.getClassLoader(), // 대상 객체의 인터페이스의 클래스로더
				new Class[] {Car.class},
				new CarInvocationHandler(car));
	}
}
