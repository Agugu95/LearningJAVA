package ��Ƽ������;

import java.awt.Toolkit;

public class ExtendsBeepThread extends Thread { // Runnable ������ �ƴ� ThreadŬ���� ���
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
