package ��Ƽ������;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallBackExample {
	private ExecutorService executorService;

	public CallBackExample() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
		// CompletionHandler<���Ÿ��, ÷��Ÿ��>

		@Override
		public void completed(Integer result, Void attachment) {
			// TODO Auto-generated method stub
			System.out.println("completed() ����: " + result);

		}

		@Override
		public void failed(Throwable exc, Void attachment) {
			// TODO Auto-generated method stub
			System.out.println("failed() ����: " + exc.toString());

		}
	};

	public void doWork(final String x, final String y) {
		Runnable task = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null); // ����ó�� �� ȣ��
				} catch (NumberFormatException e) {
					callback.failed(e, null); // ���� �߻� �� ȣ��
				}
			}
		};
		executorService.submit(task); // ������ Ǯ���� �۾� ó�� ��û
	}

	public void finish() {
		executorService.shutdown();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallBackExample backExample = new CallBackExample();
		backExample.doWork("3", "3");
		backExample.doWork("3", "��");
		backExample.finish();
	}

}
