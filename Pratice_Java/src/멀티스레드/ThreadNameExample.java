package ��Ƽ������;

public class ThreadNameExample {
	public static void main(String args[]) {
		Thread mainThread = Thread.currentThread(); // �� �ڵ带 �����ϴ� �������� ��ü ���
		System.out.println("���α׷� ���� ������ �̸�: " + mainThread.getName()); // main

		ThreadA a = new ThreadA(); // ThreadA ����
		System.out.println("�۾� ������ �̸�: " + a.getName()); // ThreadA�� ������ ������
		a.start();

		ThreadB b = new ThreadB(); // ThreadB ����
		System.out.println("�۾� ������ �̸�: " + b.getName()); // �ڵ� ��ȣ���� Thread-1
		b.start();
	}
}
