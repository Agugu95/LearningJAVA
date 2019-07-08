package 멀티스레드;

public class DaemonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		Thread.State state = autoSaveThread.getState();
		autoSaveThread.setDaemon(true); // autoSaveThread를 Daemon 스레드로 만듬
		autoSaveThread.start();

		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {

		}
		if (state != Thread.State.RUNNABLE) {
			System.out.println("메인 스레드와 작업 스레드 모두 종료");
		}
	}
}
