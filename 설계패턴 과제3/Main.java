

public class Main {
	public static void main(String[] args) {
		ElevatorController pc1 = new ElevatorController();   //���������� ��Ʈ�ѷ� ����
		Gui cm = new Gui(pc1);   //guiȯ�� ����
		
		cm.setElevatorController(new ElevatorController());  //PayCaluculator1�� ��å���� ���
	
	}

}
