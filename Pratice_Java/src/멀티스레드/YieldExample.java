package ��Ƽ������;

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YeildThreadA yeildThreadA = new YeildThreadA();
		YeildThreadB yeildThreadB = new YeildThreadB();

		yeildThreadA.start();
		yeildThreadB.start(); // Thread A B ��� ����

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		yeildThreadA.work = false; // work�� false�� yeild B�� ����

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		yeildThreadA.work = true; // true�� ������ ����

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		yeildThreadA.stop = true;
		yeildThreadB.stop = true; // �� �� ����
	}

}
