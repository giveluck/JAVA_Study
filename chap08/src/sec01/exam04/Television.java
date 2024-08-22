package sec01.exam04;

public class Television implements RemoteControl {
	//필드
	private int volume;

	@Override
	public void turnOn() { //turnOn() 추상 메소드의 실체 메소드
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() { //turnOff() 추상 메소드의 실체 메소드
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) { //setVolume() 추상 메소드의 실체 메소드
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
	
