package sec04.exam02;

public class KeyCodeExample {
	public static void main(String[] args) throws Exception {
		int keyCode;

		keyCode = System.in.read();
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read(); //캐리지 리턴(CR: 13)
		System.out.println("keyCode: " + keyCode);
		
		keyCode = System.in.read();	//라인 피드(LF: 10)
		System.out.println("keyCode: " + keyCode);
		
	}
}

