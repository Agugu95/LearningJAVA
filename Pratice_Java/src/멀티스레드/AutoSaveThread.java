package ��Ƽ������;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("�۾� ������ �����Ͽ����ϴ�.");
	}

	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}
