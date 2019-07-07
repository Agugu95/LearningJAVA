package 멀티스레드;

public class ProductThread extends Thread {
	private DataBox dataBox; // 공유 객체

	public ProductThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String data = "Data-" + i;
			dataBox.setData(data);
		}
	}
}
