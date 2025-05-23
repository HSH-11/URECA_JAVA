package sec14;
//캡슐화(필드를 private해서 감춘다)
public class Car {
	// 필드 선언
	private int speed;
	private boolean stop;
	
	// speed 필드의 Getter/Setter 선언
	public int getSpeed() {
		return speed;
	}
	//유효성 검사(private speed 필드 변경을 위한)
	//메소드를 통해 필드에 접근하도록 하는 메서드를 Setter
	public void setSpeed(int speed) {
		if (speed <= 0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
			this.stop = false;
		}
	}

	// stop 필드의 Getter/Setter 선언
	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		if (stop == true)
			this.speed = 0;
	}
}
