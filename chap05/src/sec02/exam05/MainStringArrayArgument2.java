package sec02.exam05;

public class MainStringArrayArgument2 {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}


		String strNum1 = args[0];
		//System.out.println(strNum1);
		String strNum2 = args[1];
		//System.out.println(strNum2);
		
		int num1 = Integer.parseInt(strNum1);
		//System.out.println(num1);
		int num2 = Integer.parseInt(strNum2);
		//System.out.println(num2);

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
