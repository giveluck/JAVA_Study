package sec01.exam02;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("blue"); //Form - ID
		String str2 = new String("blue"); //DB - ID
		String str3 = "blue";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str3.toString());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println(str1.hashCode()); //3027034
		System.out.println(str2.hashCode()); //3027034
		System.out.println(str3.hashCode()); //3027034
		
		System.out.println(str1 == str2); //false - 주소
		System.out.println(str1.equals(str2)); // true - 값
		System.out.println(str1 == str3); //false - 주소
		System.out.println(str1.equals(str3)); // true - 값
		
		

	}

}
