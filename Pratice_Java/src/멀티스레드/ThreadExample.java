package ��Ƽ������;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new MovieThread(); // ������ Ŭ���� ����� ���� �۾� ������ ��ü
		thread1.setDaemon(true);
		thread1.start();

//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//
//		}
//		thread1.interrupt();

		Thread thread2 = new Thread(new MusicRunnable()); // Runnable �������̽� ������ ���� �۾� ������ ��ü
		thread2.start();
	}

}
