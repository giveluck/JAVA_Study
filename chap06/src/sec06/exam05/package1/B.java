package sec06.exam05.package1; // 패키지가 동일함

public class B {
	public B() {
		A a = new A();
		a.field1 = 1; //public 접근 제한자   
		a.field2 = 1; //default 접근 제한자   
		a.field3 = 1;  // private 필드 접근 불가(컴파일 에러)
		
		a.method1(); //public 접근 제한자  
		a.method2(); //default 접근 제한자  
		//a.method3(); // private 메서드 접근 불가(컴파일 에러)  
	}
}

