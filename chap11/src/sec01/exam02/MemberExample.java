package sec01.exam02;

public class MemberExample {
	public static void main(String[] args) {
		
		Member obj1 = new Member("blue"); //Form - ID
		Member obj2 = new Member("blue"); //DB - ID
		Member obj3 = new Member("red");
		
//		System.out.println(obj1);
//		System.out.println(obj2);
//		System.out.println(obj3);
//		
//		System.out.println(System.identityHashCode(obj1));
//		System.out.println(System.identityHashCode(obj2));
//		System.out.println(System.identityHashCode(obj3));
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
		
		
		if(obj1.equals(obj2)) { //주소 
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if(obj1.equals(obj3)) { //주소
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
		
	}
}
