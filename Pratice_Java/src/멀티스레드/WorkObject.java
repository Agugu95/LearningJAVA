package ��Ƽ������;

public class WorkObject { // ThreadA�� ThreadB�� �۾��� ����ȭ �޼ҵ�� �ۼ��� ���� ��ü
	public synchronized void methodA() { // ����ȭ �޼ҵ�A
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {

		}
	}

	public synchronized void methodB() { // ����ȭ �޼ҵ�B
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {

		}
	}
}
