package course3;

public class Test {

	public static void main(String[] args) {
		Rentable<Home> homeAgency = new HomeAgency();
		homeAgency.rent();
		
		Rentable<Car> carAgency = new CarAgency();
		carAgency.rent();
		
		
	}

}
