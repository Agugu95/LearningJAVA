package ��Ƽ������;

public class InterruptThread extends Thread {
	@Override
	public void run() {
//		try {
//			while (true) {
//				System.out.println("���� ��");
//				Thread.sleep(1);
//
//			}
//		} catch (InterruptedException e) { // InterruptedException�� �����尡 �ݵ�� �Ͻ����� �Ǿ��� ���� �߻�
//
//		}

		while (true) {
			System.out.println("���� ��");
			if (isInterrupted() == true) { // interrupt �޼ҵ尡 ȣ��Ǹ� true��ȯ
				break;
			}
		}
		System.out.println("�ڿ� ����");
		System.out.println("���� ����");
	}
}
