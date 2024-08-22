package sec02.exam04;

public class ArrayLengthExample {
	public static void main(String[] args) {
		int[] scores = new int[5];
		scores = new int[] {80,93,79};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		System.out.printf("평균 : %.2f", avg);
	}
}
