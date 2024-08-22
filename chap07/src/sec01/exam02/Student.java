package sec01.exam02;

public class Student extends People{
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모 클래스의 매개변수가 있는 생성자 호출
		this.studentNo = studentNo;
	}
}

