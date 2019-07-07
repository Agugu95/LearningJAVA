package 멀티스레드;

import java.awt.Toolkit;

public class ExtendsBeepThread extends Thread { // Runnable 구현이 아닌 Thread클래스 상속
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
