package sec01.exam02;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		//BeepTask beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(1500); } catch(Exception e) {}
		}
	}
}


