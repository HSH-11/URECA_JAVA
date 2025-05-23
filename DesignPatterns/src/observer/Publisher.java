package observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {

	private List<Observer> observers = new ArrayList<>();

	@Override
	public void attach(Observer observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		// TODO Auto-generated method stub
		observers.remove(observer);

	}

	@Override
	public void notifyUpdate(Message message) {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

}
