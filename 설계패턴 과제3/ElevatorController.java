//층수 변경을 통보하므로 Subject클래스를 상속받음
public class ElevatorController extends Subject {
	private int curFloor =1;
	
	public void gotoFloor(int destination) { //현재의 층을 set()
		//목적지 층을 현재 층으로 설정, 즉 엘레베이터를 목적지 층으로 이동시킴
		curFloor = destination;
		notifyObservers();  //최신화
	}
	
	public int getCurFloor() {    //현재의 층을 반환하는 get()
		return curFloor;
	}
}
