package 멀티스레드;

public class WorkThreadB extends Thread {
	private WorkObject workObject;

	public WorkThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodB();
		}
	}
}
