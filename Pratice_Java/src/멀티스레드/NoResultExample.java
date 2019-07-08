package ��Ƽ������;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// CPU�� �ھ �Ҵ� �� �� �ִ� ������ �� ��ŭ ������ Ǯ ����

		System.out.println("�۾� ó�� ��û");
		Runnable runnable = new Runnable() { // Runnable �������̽� �͸��� ��ü
			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("ó�� ���: " + sum);
			}
		};
		Future future = executorService.submit(runnable); // submit()�� ���� runnable/callable �۾��� ������ Ǯ�� �۾� ť�� ���� ��
															// future��ȯ ������� ������ ����ó���� ���� future��ü

		try {
			future.get();
			System.out.println("�۾� ó�� �Ϸ�");
		} catch (Exception e) {
			System.out.println("���� ���� �߻���" + e.getMessage());
		}
		executorService.shutdown();
	}

}
