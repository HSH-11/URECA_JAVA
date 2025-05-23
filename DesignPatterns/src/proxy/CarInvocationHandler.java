package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CarInvocationHandler implements InvocationHandler {
	
	private Car car;
	public CarInvocationHandler(Car car) {
		this.car = car;
	}
	
//	@Override
//	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//		System.out.println("Proxy Handler Invoke");
//		// 실제 객체의 메소드를 호출
//		Object result = method.invoke(car, args);
//		
//		// 실체 객체의 메소드 호출 후 추가 작업은 여기에 
//		return result;
//	}
	
	// Lazy Loading (드라이브 할 때 엔진 스타트)
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Proxy Handler Invoke");
		// 호출된 메소드가 enginStart이면 아무것도 하지 않는다.
		if (method.getName().equals("engineStart")) return null;
		
		if (method.getName().equals("drive")) {
			car.engineStart();
		}
		
		Object result = method.invoke(car, args);
		
		// 실체 객체의 메소드 호출 후 추가 작업은 여기에 
		return result;
	}

}
