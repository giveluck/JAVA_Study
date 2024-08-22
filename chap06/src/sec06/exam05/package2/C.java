package sec06.exam05.package2; // 패키지 다름

import sec06.exam05.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;   // public 접근 제한자
		//a.field2 = 1; // default 필드 접근 불가(컴파일 에러)
		//a.field3 = 1; // private 필드 접근 불가(컴파일 에러) 
		
		a.method1();   // public 접근 제한자
		//a.method2(); // default 메서드 접근 불가(컴파일 에러)
		//a.method3(); // private 메서드 접근 불가(컴파일 에러) 
	}
}


