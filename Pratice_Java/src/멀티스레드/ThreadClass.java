package ��Ƽ������;

import java.awt.Toolkit;

public class ThreadClass implements Runnable {
	// Beep �Ҹ��� ���ִ� �۾� ������ (Runnable ����)
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
