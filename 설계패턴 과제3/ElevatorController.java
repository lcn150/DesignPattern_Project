//���� ������ �뺸�ϹǷ� SubjectŬ������ ��ӹ���
public class ElevatorController extends Subject {
	private int curFloor =1;
	
	public void gotoFloor(int destination) { //������ ���� set()
		//������ ���� ���� ������ ����, �� ���������͸� ������ ������ �̵���Ŵ
		curFloor = destination;
		notifyObservers();  //�ֽ�ȭ
	}
	
	public int getCurFloor() {    //������ ���� ��ȯ�ϴ� get()
		return curFloor;
	}
}
