package course3;

public class HomeAgency implements Rentable<Home> {
	public Home rent() {
		return new Home();
	}
}
