package sec01.exam01;

public class DmbCellPhone extends CellPhone {
	//필드
	int channel;
	

	//생성자
	public DmbCellPhone() { //기본 생성자
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DmbCellPhone(int channel) { // 매개변수가 있는 생성자
		super();
		this.channel = channel;
	}

	public DmbCellPhone(String model, String color) { // 매개변수가 있는 생성자
		//super(model, color);
		this.model = model;  // CellPhone 클래스로부터 상속받은 필드
		this.color = color;  // CellPhone 클래스로부터 상속받은 필드
		// TODO Auto-generated constructor stub
		System.out.println("DmbCellPhone(model, color) 생성자 호출");
	}

	DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		//this.model = model;  // CellPhone 클래스로부터 상속받은 필드
		//this.color = color;  // CellPhone 클래스로부터 상속받은 필드
		this.channel = channel;
		System.out.println("DmbCellPhone(model, color, channel) 생성자 호출");
	}

	//메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}	
}

