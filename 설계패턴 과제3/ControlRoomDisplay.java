//중앙 통제실에 엘레베이터의 위치를 표시하는 클래스
//변경을 통보받으려고 Observer를 구현함
public class ControlRoomDisplay implements Observer {
	private ElevatorController controller;
	
	public ControlRoomDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {  //엘레베이터의 위치를 중앙 통제실에 표시
		int curFloor = controller.getCurFloor();
		System.out.println("Control Room : "+ curFloor);

	}

}
