package ��Ƽ������;

public class Calculator {
	private int memory;

	public int getMemory() { // getter �Լ�
		return memory;
	}

//	public void setMemory(int memory) { // setter �Լ� ���� �޸𸮿� ���� ����
//		this.memory = memory; // �Ķ���͸� �ʵ忡 ����
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}

	public synchronized void setMemory(int memory) { // syncronized Ű���带 ����� ����ȭ �޼ҵ�
		// syncronized(this) { ����ȭ ���
		this.memory = memory;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
