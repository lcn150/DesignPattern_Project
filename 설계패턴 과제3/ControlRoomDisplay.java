//�߾� �����ǿ� ������������ ��ġ�� ǥ���ϴ� Ŭ����
//������ �뺸�������� Observer�� ������
public class ControlRoomDisplay implements Observer {
	private ElevatorController controller;
	
	public ControlRoomDisplay(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {  //������������ ��ġ�� �߾� �����ǿ� ǥ��
		int curFloor = controller.getCurFloor();
		System.out.println("Control Room : "+ curFloor);

	}

}
