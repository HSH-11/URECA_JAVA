package observer;

public class SubscriberTwo implements Observer{

	@Override
	public void update(Message message) {
		// TODO Auto-generated method stub
		System.out.println("SubscriberTwo Received: " + message.getMessageContent());

	}

}
