package ��Ƽ������;

public class PrintTargetThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) { // 10��� ������ ���� ��� ����

		}

		try {
			Thread.sleep(1500); // ������ �������� 1.5�ʰ� TIME_WATING
		} catch (Exception e) {

		}

		for (long i = 0; i < 1000000000; i++) { // 10��� ������ ���� ���

		}

	}
}
