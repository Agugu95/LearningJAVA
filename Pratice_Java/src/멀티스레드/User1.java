package ��Ƽ������;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) { // ������ �̸��� user1�� ����
		this.setName("User1");
		this.calculator = calculator; // ���� ��ü�� �ʵ忡 ����
	}

	@Override
	public void run() {
		calculator.setMemory(100); // ���� ��ü �޸𸮿� 100�� ����
	}
}
