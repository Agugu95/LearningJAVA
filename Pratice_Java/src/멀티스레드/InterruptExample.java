package 멀티스레드;

public class InterruptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new InterruptThread(); // 업캐스팅
		thread.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}

		thread.interrupt();
	}

}
