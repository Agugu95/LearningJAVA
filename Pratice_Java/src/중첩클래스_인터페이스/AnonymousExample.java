package ��øŬ����_�������̽�;

public class AnonymousExample {
	public static void main(String args[]) {
		Anonymous anonymous = new Anonymous();
		anonymous.field.run();
		anonymous.method1();
		anonymous.method2(new Vehicle() { // �������̽� �͸� ���� ��ü

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Ʈ���� �޸��ϴ�.");
			}

		});
	}
}
