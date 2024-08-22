package sec01.exam01;

public class CellPhone {
	//필드
	protected String model;
	protected String color;
	
	//기본 생성자
	public CellPhone() {
		System.out.println("CellPhone() 생성자 호출");
	}
	
	//매개 변수가 있는 생성자
	public CellPhone(String model, String color) { 
		//super();
		this.model = model;
		this.color = color;
		System.out.println("CellPhone(model, color) 생성자 호출");
	}


	//메소드
	void powerOn() { System.out.println("전원을 켭니다."); }	
	void powerOff() { System.out.println("전원을 끕니다."); }
	void bell() { System.out.println("벨이 울립니다."); }	
	void sendVoice(String message) { System.out.println("자기: " + message); }	
	void receiveVoice(String message) { System.out.println("상대방: " + message); }	
	void hangUp() { System.out.println("전화를 끊습니다."); }
}

