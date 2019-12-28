//건물의 층에 엘레베이터 위치를 표시하는 클래스
public class FloorDisplay implements Observer {
	private ElevatorController controller;
	
	public FloorDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("Floor Display: "+ curFloor);

	}

}
