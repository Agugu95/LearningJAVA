package ��Ƽ������;

public class DataBox {
	private String data;

	public synchronized String getData() { // ����ȭ �޼ҵ� data�� null�̸� consumer�����带 �Ͻ�����
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		String returnValue = data;
		System.out.println("ConsumerThread�� ���� ������: " + returnValue);
		data = null; // data�� null�� ����� product �����带 ���� ��� ����
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		this.data = data;
		System.out.println("Product Thread�� ������ ������: " + data);
		notify();
	}
}
