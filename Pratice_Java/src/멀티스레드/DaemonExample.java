package ��Ƽ������;

import java.lang.Thread.State;

public class DaemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // autoSaveThread�� Daemon ������� ����
		autoSaveThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		if (autoSaveThread.getState() == State.TERMINATED) {
			System.out.println("���� ������� �۾� ������ ��� ����");
		}
	}
}
