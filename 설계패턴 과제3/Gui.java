import java.awt.Label;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

class Gui extends Frame implements ActionListener, DocumentListener {
	private ElevatorController elevatorcontroller;  //�������  (��������)  set()/get()
	Font f3 = new Font("����", Font.BOLD, 30);
	Font f2 = new Font("����", Font.BOLD, 20);
	
	private JLabel gotoFloor = new JLabel("ElevatorController", Label.RIGHT);    //�������� �������� ��
	private JLabel ControlRoomDisplaytext = new JLabel("ControlRoomDisplay", Label.RIGHT);    //�������� ��
	private JLabel ElevatorDisplaytext = new JLabel("ElevatorDisplay", Label.RIGHT);    //�������� ��
	private JLabel FloorDisplaytext = new JLabel("FloorDisplay", Label.RIGHT);    //�������� ��
	private JLabel VoiceNoticetext = new JLabel("VoiceNotice", Label.RIGHT);    //�������� ��
	
	
	private JTextField gotoFloortext = new JTextField();    //�������� �Է� �ؽ�Ʈ
	private JTextField controlroomdisplayResult = new JTextField();     //����� ����ϴ� ��
	private JTextField elevatordisplayResult = new JTextField();     //����� ����ϴ� ��
	private JTextField floordisplayResult = new JTextField();     //����� ����ϴ� ��
	private JTextField voicenoticeResult = new JTextField();     //����� ����ϴ� ��
	
	
	private JButton ControlRoomDisplay = new JButton("ControlRoomDiplay");    //ControlRoomDisplay��ư
	private JButton ElevatorDisplay = new JButton("ElevatorDiplay");    //ElavtorDisplay��ư
	private JButton FloorDisplay = new JButton("FloorDiplay");    //FloorDisplay��ư
	private JButton VoiceNotice = new JButton("VoiceNotice");    //VoiceNotice��ư
	
	private JButton resetButton = new JButton("Reset");     //���¹�ư
	private JButton end = new JButton("Stop");     //������ư
	
	public Gui(ElevatorController elevatorcontroller) {   //�ʱ� ������
		super("Elevator Controller");
		this.setElevatorController(elevatorcontroller);
		this.init();
		this.start();
		this.setSize(1700,500);
		this.setVisible(true);
	}
	

	public void init() {    //�ؽ�Ʈ�� ��ư�� ��ġ�ϴ� ����
		this.setLayout(new GridLayout(5,1));
		
		Panel p = new Panel(new BorderLayout());
		p.add("West", gotoFloor);
		p.add("Center", gotoFloortext);
		this.add(p);
		gotoFloor.setFont(f3);
		gotoFloortext.setFont(f3);
		
		Panel p2 = new Panel(new FlowLayout(FlowLayout.CENTER));   //��ư ����
		p2.add(ControlRoomDisplay);
		p2.add(ElevatorDisplay);
		p2.add(FloorDisplay);
		p2.add(VoiceNotice);
		this.add(p2);
		ControlRoomDisplay.setFont(f2);
		ElevatorDisplay.setFont(f2);
		FloorDisplay.setFont(f2);
		VoiceNotice.setFont(f2);
		
		
		Panel p3 = new Panel(new BorderLayout());    //����� ���
		p3.add("West", ControlRoomDisplaytext);
		p3.add("Center", controlroomdisplayResult);
		this.add(p3);
		ControlRoomDisplaytext.setFont(f3);
		controlroomdisplayResult.setFont(f3);
		
		Panel p4 = new Panel(new BorderLayout());    //����� ���
		p4.add("West", ElevatorDisplaytext);
		p4.add("Center", elevatordisplayResult);
		this.add(p4);
		ElevatorDisplaytext.setFont(f3);
		elevatordisplayResult.setFont(f3);
		
		Panel p5 = new Panel(new BorderLayout());    //����� ���
		p5.add("West", FloorDisplaytext);
		p5.add("Center", floordisplayResult);
		this.add(p5);
		FloorDisplaytext.setFont(f3);
		floordisplayResult.setFont(f3);
		
		Panel p6 = new Panel(new BorderLayout());    //����� ���
		p6.add("West", VoiceNoticetext);
		p6.add("Center", voicenoticeResult);
		this.add(p6);
		VoiceNoticetext.setFont(f3);
		voicenoticeResult.setFont(f3);
		
		Panel p7 = new Panel(new FlowLayout(FlowLayout.RIGHT));    //���¹�ư+������ư
		p7.add(resetButton);
		p7.add(end);
		this.add(p7);
	}
	
	public void start() {  //�ɼ��� ����������(������ ����������) �߿�
		ControlRoomDisplay.addActionListener(this);  //��ư�� ����(���ȴ��� �ȴ��ȴ���)�� this�� ����
		ElevatorDisplay.addActionListener(this);  //��ư�� ����(���ȴ��� �ȴ��ȴ���)�� this�� ����
		FloorDisplay.addActionListener(this);  //��ư�� ����(���ȴ��� �ȴ��ȴ���)�� this�� ����
		VoiceNotice.addActionListener(this);  //��ư�� ����(���ȴ��� �ȴ��ȴ���)�� this�� ����
		resetButton.addActionListener(this);
		//add ��ư
		
		gotoFloortext.getDocument().addDocumentListener(this);
		//
		
		
		end.addActionListener(this);
		
		ControlRoomDisplay.setEnabled(false);
		ElevatorDisplay.setEnabled(false);
		FloorDisplay.setEnabled(false);
		VoiceNotice.setEnabled(false);
		resetButton.setEnabled(false);
	}
	
	public boolean isDataEntered() {  //���� �־��ִ� 
		if(gotoFloortext.getText().trim().length() ==0)
			return false;
	
		return true;
	}
	public void insertUpdate(DocumentEvent e) {
		checkData();
	}
	public void removeUpdate(DocumentEvent e) {
		checkData();
	}
	public void changedUpdate(DocumentEvent e) {
		checkData();
	}
	private void checkData() {
		ControlRoomDisplay.setEnabled(isDataEntered());
		FloorDisplay.setEnabled(isDataEntered());
		VoiceNotice.setEnabled(isDataEntered());
		ElevatorDisplay.setEnabled(isDataEntered());
	}
	
	public void actionPerformed(ActionEvent e) {  //�׼� ����
		if(e.getSource() == end) {
			System.exit(0);
		}
		if(e.getSource() == resetButton) {
			gotoFloortext.setText("");
			gotoFloortext.requestFocus();
			controlroomdisplayResult.setText("");
			elevatordisplayResult.setText("");
			floordisplayResult.setText("");
			voicenoticeResult.setText("");
			resetButton.setEnabled(false);
			return;
		}
		if(e.getSource() == ControlRoomDisplay) {
			int x = 0;
			try {
				x = Integer.parseInt(gotoFloortext.getText().trim());
			} catch(NumberFormatException ee) {
				gotoFloortext.setText("");
				gotoFloortext.requestFocus();
				return;
			}
			
			controlroomdisplayResult.setText("In Control Room :"+"["+x+"]");
			controlroomdisplayResult.setFont(f3);
			resetButton.setEnabled(true);
		}
		if(e.getSource() == ElevatorDisplay) {
			int x = 0;
			try {
				x = Integer.parseInt(gotoFloortext.getText().trim());
			} catch(NumberFormatException ee) {
				gotoFloortext.setText("");
				gotoFloortext.requestFocus();
				return;
			}
			
			elevatordisplayResult.setText("In Elevator : "+"["+x+"]");
			elevatordisplayResult.setFont(f3);;
			resetButton.setEnabled(true);
		}
		if(e.getSource() == FloorDisplay) {
			int x = 0;
			try {
				x = Integer.parseInt(gotoFloortext.getText().trim());
			} catch(NumberFormatException ee) {
				gotoFloortext.setText("");
				gotoFloortext.requestFocus();
				return;
			}
		
			floordisplayResult.setText("In Floor : "+"["+x+"]");
			floordisplayResult.setFont(f3);
			resetButton.setEnabled(true);
		}
		if(e.getSource() == VoiceNotice) {
			int x = 0;
			try {
				x = Integer.parseInt(gotoFloortext.getText().trim());
			} catch(NumberFormatException ee) {
				gotoFloortext.setText("");
				gotoFloortext.requestFocus();
				return;
			}
			//����� ����� ��� Ŭ����ȣ��
			voicenoticeResult.setText("Voice say "+"["+x+"]"+" Floor");
			voicenoticeResult.setFont(f3);
			resetButton.setEnabled(true);
		}
		
		
	}

	public ElevatorController getElevatorController() {
		return elevatorcontroller;
	}

	public void setElevatorController(ElevatorController elevatorcontroller) {
		this.elevatorcontroller = elevatorcontroller;
	}
	
}

