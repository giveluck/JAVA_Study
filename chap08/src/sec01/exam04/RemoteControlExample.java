package sec01.exam04;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc; // 인터페이스 변수
		
		rc = new Television(); // 구현 객체 생성
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
		
		rc = new Audio();	// 구현 객체 생성
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();
	}
}
