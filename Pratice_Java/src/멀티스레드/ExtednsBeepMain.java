package ��Ƽ������;

import java.awt.Toolkit;

public class ExtednsBeepMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread thread = new ExtendsBeepThread(); // ������ ���Ŭ������ ��ü ����
//		thread.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Beep");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

		Thread thread = new ExtendsBeepThread() { // �͸� ��ü�� ����
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
