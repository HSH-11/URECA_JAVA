package observer;

public class SubscriberThree implements Observer{

	@Override
	public void update(Message message) {
		// TODO Auto-generated method stub
		System.out.println("SubscriberThree Received: " + message.getMessageContent());

	}

}
