package 멀티스레드;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallBackExample {
	private ExecutorService executorService;

	public CallBackExample() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	}

	private CompletionHandler<Integer, Void> callback = new CompletionHandler<Integer, Void>() {
		// CompletionHandler<결과타입, 첨부타입>

		@Override
		public void completed(Integer result, Void attachment) {
			// TODO Auto-generated method stub
			System.out.println("completed() 실행: " + result);

		}

		@Override
		public void failed(Throwable exc, Void attachment) {
			// TODO Auto-generated method stub
			System.out.println("failed() 실행: " + exc.toString());

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
					callback.completed(result, null); // 정상처리 시 호출
				} catch (NumberFormatException e) {
					callback.failed(e, null); // 예외 발생 시 호출
				}
			}
		};
		executorService.submit(task); // 스레드 풀에게 작업 처리 요청
	}

	public void finish() {
		executorService.shutdown();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallBackExample backExample = new CallBackExample();
		backExample.doWork("3", "3");
		backExample.doWork("3", "삼");
		backExample.finish();
	}

}
