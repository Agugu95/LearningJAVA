package ��Ƽ������;

public class BeepThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable beepTask = new ThreadClass(); // Runnable Ÿ������ ������ �۾� ������ ��ü
		Thread thread = new Thread(beepTask); // ��ü�� �����ڿ� ������ ��¥ �����Ǵ� ������
		thread.start(); // ��ü -> ������ -> start() �� ����� ������
		// Beep �Ҹ��� ���� �۾� ������(Runnable�� ���� ��Ƽ ������)

		for (int i = 0; i < 5; i++) { // ����Ʈ�۾� ������(����)
			System.out.println("Beep");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}

}
