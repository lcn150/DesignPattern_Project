import java.util.ArrayList;

public abstract class Subject {   //SubjectŬ���� �׻� ������
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
