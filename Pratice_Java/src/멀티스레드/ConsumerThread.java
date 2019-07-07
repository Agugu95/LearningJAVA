package 멀티스레드;

public class ConsumerThread extends Thread {
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 3; i++) {
			@SuppressWarnings("unused")
			String data = dataBox.getData();
		}
	}
}
