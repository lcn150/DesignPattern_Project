

public class Main {
	public static void main(String[] args) {
		ElevatorController pc1 = new ElevatorController();   //엘레베이터 컨트롤러 생성
		Gui cm = new Gui(pc1);   //gui환경 생성
		
		cm.setElevatorController(new ElevatorController());  //PayCaluculator1의 정책으로 계산
	
	}

}
