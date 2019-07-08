package 멀티스레드;

public class WorkThreadException extends Thread {
	public WorkThreadException(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(getName() + " Interrupted");
				break;
			}
		}
		System.out.println(getName() + " Terminated");
	}
}
