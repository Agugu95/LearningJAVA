package 멀티스레드;

import java.awt.Toolkit;

public class BeepThreadMainAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new Thread(new ThreadClass()) {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {

					}
				}

			}
		};
		for (int i = 0; i < 5; i++) { // 프린트작업 스레드(메인)
			System.out.println("Beep");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
	}
}
