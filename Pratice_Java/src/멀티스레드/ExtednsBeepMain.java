package 멀티스레드;

import java.awt.Toolkit;

public class ExtednsBeepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread thread = new ExtendsBeepThread(); // 스레드 상속클래스로 객체 생성
//		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

		Thread thread = new ExtendsBeepThread() { // 익명 객체로 생성
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
		};
	}

}
