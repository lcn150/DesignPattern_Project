//�������� �ȳ��ϴ� Ŭ����
public class VoiceNotice implements Observer {
	//������ �뺸�������� Observer�� ������
	private ElevatorController controller;
	
	public VoiceNotice(ElevatorController controller) {
		this.controller = controller;
	}
	public void update() {
		int curFloor = controller.getCurFloor();
		System.out.println("Voice Notice: "+curFloor);

	}

}
