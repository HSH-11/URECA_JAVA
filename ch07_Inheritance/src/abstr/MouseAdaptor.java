package abstr;

public abstract class MouseAdaptor {
	public void click() {
		System.out.println("click");
	}
	public void dbclick() {
		System.out.println("double click");
	}
	
	//추상 메소드
	public abstract void over();
	public abstract void out();
}
