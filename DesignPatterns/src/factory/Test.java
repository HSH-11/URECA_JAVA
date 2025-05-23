package factory;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Transportation t1 = new Car();
//		Transportation t2 = new AirPlane();
//		Transportation t3 = new Helicopter();
		
		Transportation t1 = TransportationFactory.getTransportation("C");
		Transportation t2 = TransportationFactory.getTransportation("A");
		Transportation t3 = TransportationFactory.getTransportation("H");
		
		t1.move();
		t2.move();
		t3.move();
	}

}
