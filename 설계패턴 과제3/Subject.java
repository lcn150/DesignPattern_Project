import java.util.ArrayList;

public abstract class Subject {   //Subject클래슽 항상 동일함
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public void attach(Observer observer) {
		observers.add(observer);
	}
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	public void notifyObservers() {
		for(Observer o : observers)
			o.update();
	}
}
