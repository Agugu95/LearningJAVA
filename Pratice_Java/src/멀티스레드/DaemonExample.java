package 멀티스레드;

import java.lang.Thread.State;

public class DaemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // autoSaveThread를 Daemon 스레드로 만듬
		autoSaveThread.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		if (autoSaveThread.getState() == State.TERMINATED) {
			System.out.println("메인 스레드와 작업 스레드 모두 종료");
		}
	}
}
