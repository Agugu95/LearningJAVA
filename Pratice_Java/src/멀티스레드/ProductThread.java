package ��Ƽ������;

public class ProductThread extends Thread {
	private DataBox dataBox; // ���� ��ü

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
