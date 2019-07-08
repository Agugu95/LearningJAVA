package 멀티스레드;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new MovieThread(); // 스레드 클래스 상속을 통한 작업 스레드 객체
		thread1.setDaemon(true);
		thread1.start();

//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//
//		}
//		thread1.interrupt();

		Thread thread2 = new Thread(new MusicRunnable()); // Runnable 인터페이스 구현을 통한 작업 스레드 객체
		thread2.start();
	}

}
