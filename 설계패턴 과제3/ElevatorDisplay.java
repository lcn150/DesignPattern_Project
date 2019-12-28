//엘레베이터 내부에 층수를 표시하는 클래스
//변경을 통보받으려고 Observer를 구현함
public class ElevatorDisplay implements Observer {
	private ElevatorController controller;
	
	public ElevatorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("Elevator Display: " +curFloor);

	}

}
