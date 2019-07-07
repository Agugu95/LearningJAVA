package 멀티스레드;

import java.awt.Toolkit;

public class ThreadClass implements Runnable {
	// Beep 소리를 내주는 작업 스레드 (Runnable 구현)
	@Override
	public void run() {
		// TODO Auto-generated method stub
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
