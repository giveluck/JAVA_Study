package sec01.exam01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		//객체의 주소가 같은지 살펴봄.
		System.out.println(s1 == s2);
	}
}

