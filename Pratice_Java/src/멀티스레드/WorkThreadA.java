package ��Ƽ������;

public class WorkThreadA extends Thread {
	private WorkObject workObject;

	public WorkThreadA(WorkObject workObject) {
		this.workObject = workObject; // ���� ��ü�� �Ķ���ͷ� �޾� �ʵ忡 ����
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodA(); // ���� ��ü�� ����ȭ �޼ҵ�A 10�� ����
		}
	}
}
