package ��Ƽ������;

public class DaemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		Thread.State state = autoSaveThread.getState();
		autoSaveThread.setDaemon(true); // autoSaveThread�� Daemon ������� ����
		autoSaveThread.start();

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {

		}
		if (state != Thread.State.RUNNABLE) {
			System.out.println("���� ������� �۾� ������ ��� ����");
		}
	}
}
