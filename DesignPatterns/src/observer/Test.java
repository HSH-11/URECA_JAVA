package observer;

public class Test {

	public static void main(String[] args) {
		SubscriberOne one = new SubscriberOne();
		SubscriberTwo two = new SubscriberTwo();
		SubscriberThree three = new SubscriberThree();
		
		// 메세지 구독 관리 publisher
		Publisher publisher = new Publisher();
		
		// 메세지 구독 시작
		publisher.attach(one);
		publisher.attach(two);
		
		publisher.notifyUpdate(new Message("first"));
		
		publisher.detach(one);
		publisher.attach(three);
		
		publisher.notifyUpdate(new Message("second"));
	}

}
