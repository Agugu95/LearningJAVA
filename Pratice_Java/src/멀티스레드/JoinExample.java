package ��Ƽ������;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join(); // sumThread ���� ������ ���� ������ �Ͻ�����
		} catch (InterruptedException e) {

		} // ���� join�� ���ٸ� ���� 0 �� ����
			// ��� �Ϸ� ���� main thread�� ��¹��� ���� �Ǳ� ����
		System.out.println("1 ~ 100������ ��: " + sumThread.getSum());
	}

}
