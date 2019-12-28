//�ǹ��� ���� ���������� ��ġ�� ǥ���ϴ� Ŭ����
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
