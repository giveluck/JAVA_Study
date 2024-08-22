package sec02.exam10;

public class ContinueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			if(i%2 == 1) { //홀수이면
				continue;
			}
			System.out.println(i);
		}
	}

}
