package ��Ƽ������;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletionServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(executorService);
		// CompletionService <V> = new ExecutorCompletionService<V>();

		System.out.println("�۾� ó�� ��û");
		for (int i = 0; i < 3; i++) {
			completionService.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception { // ������ Ǯ�� �۾�ó�� ��û (ť�� ���)
					// TODO Auto-generated method stub
					int sum = 0;
					for (int i = 1; i <= 10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}

		System.out.println("ó�� �Ϸ� �۾� Ȯ��");
		executorService.submit(new Runnable() { // ������ Ǯ�� �����忡�� ����

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					try {
						Future<Integer> future = completionService.take(); // �Ϸ�� �۾� ��������, �ȵƴٸ� ���ŷ
						int value = future.get(); // ����ŷ
						System.out.println("ó�� ���: " + value);
					} catch (Exception e) {
						break;
					}
				}

			}
		});

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		executorService.shutdownNow();
	}

}
