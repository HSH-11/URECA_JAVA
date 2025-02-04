package course2;

public class Test {

	public static void main(String[] args) {
		Product<TV,String> product1 = new Product<>();
		product1.setKind(new TV());
		product1.setModel("OLED");
		
		Product<Car,String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("제네시스");
		
		Car car = product2.getKind();
		String carModel = product2.getModel();
	}

}
