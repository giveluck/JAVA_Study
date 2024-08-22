package sec01.exam02;

public class ObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(System.identityHashCode(obj1));
		System.out.println(System.identityHashCode(obj2));
		
		boolean result1 = obj1.equals(obj2);
		System.out.println(result1);
		boolean result2 = (obj1 == obj2);
		System.out.println(result2);
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
	}

}
