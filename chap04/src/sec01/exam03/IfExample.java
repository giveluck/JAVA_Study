package sec01.exam03;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 65;
		
		if(score>=90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A 입니다.");
		}
		if(score>=80 && score<=89) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		}
		if(score>=70 && score<=79) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		}
		if (score<70) {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D 입니다.");
		}
		
	}

}
