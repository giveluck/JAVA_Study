package sec01.exam02;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(1500); } catch(Exception e) {
				e.printStackTrace();
			}
		}
	}	
	
//	public void run() {		
//		Toolkit toolkit = Toolkit.getDefaultToolkit();	
//		for(int i=0; i<5; i++) {		
//			toolkit.beep();
//			try { Thread.sleep(500); } catch(Exception e) {}
//		}
//	}
}

