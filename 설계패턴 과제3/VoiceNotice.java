//음성으로 안내하는 클래스
public class VoiceNotice implements Observer {
	//변경을 통보받으려고 Observer를 구현함
	private ElevatorController controller;
	
	public VoiceNotice(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("Voice Notice: "+curFloor);

	}

}
