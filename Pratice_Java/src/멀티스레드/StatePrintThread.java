package ��Ƽ������;

public class StatePrintThread extends Thread {
	private Thread PrintTargetThread; // ������ Ÿ�� �ʵ�

	public StatePrintThread(Thread thread) { // ������
		this.PrintTargetThread = thread; // �ʵ忡 Ÿ�� ������ ���� ����
	}

	@Override
	public void run() {
		while (true) {
			Thread.State state = PrintTargetThread.getState(); // ������ ���� ���
			System.out.println("Ÿ�� ������ ����: " + state);

			if (state == Thread.State.NEW) { // �������� ���°� NEW (������)��� ����
				PrintTargetThread.start();
			}

			if (state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
