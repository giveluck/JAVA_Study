package sec05.exam03;

public class Car {
	
	static String name ="포르쉐";
	
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	
	public static void main(String[] args) {
		Car myCar = new Car(); 
		myCar.speed = 60;
		myCar.run();
		
		System.out.println(Car.name);
		System.out.println(myCar.name);
		
	}
}

