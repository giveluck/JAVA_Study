package sec01.exam03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		//교환법칙
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
		
		// x와 y 모두 3이 출력됨.
//		y = x;
//		x = y;
//		System.out.println("x:" + x + ", y:" + y);
		
		// x와 y 모두 5가 출력됨.
//		x = y;
//		y = x;
//		System.out.println("x:" + x + ", y:" + y);
		
	}
}
