package ��Ƽ������;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// �ھ ������ �� �ִ� ������ �� ��ŭ ������ Ǯ ����

		System.out.println("�۾� ó�� ��û");
		Callable<Integer> task = new Callable<Integer>() { // ��ȯ���� �ִ� Callable ��ü ����
			// Callable ��ü�� ��ȯ���� T Ÿ���� ��������
			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				int sum = 0;
				for (int i = 0; i <= 10; i++) {
					sum += i;
				}
				return sum; // integer ��ȯ
			}
		};
		Future<Integer> future = executorService.submit(task); // ��ü�� ������ Ǯ�� �۾� ť�� ��� �� future ��ü ��ȯ

		try {
			int sum = future.get(); // ���ŷ ��ü�� �۾��� �Ϸ� �� ó�� ��� V�� ����
			// submit�� ���� ����� Callable ��ü�� call() �޼ҵ� �۾��� ���� �� ��
			// ���ŷ �Ǿ� �ִ� get()�޼ҵ� ����, TŸ���� �� Integer ��ȯ
			System.out.println("ó�����: " + sum);
			System.out.println("�۾� ó�� �Ϸ�");
		} catch (Exception e) {
			System.out.println("���� ���� �߻�" + e.getMessage());
		}
		executorService.shutdown();
	}

}
