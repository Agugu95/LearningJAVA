package 멀티스레드;

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

		System.out.println("작업 처리 요청");
		for (int i = 0; i < 3; i++) {
			completionService.submit(new Callable<Integer>() {

				@Override
				public Integer call() throws Exception { // 스레드 풀에 작업처리 요청 (큐에 등록)
					// TODO Auto-generated method stub
					int sum = 0;
					for (int i = 1; i <= 10; i++) {
						sum += i;
					}
					return sum;
				}
			});
		}

		System.out.println("처리 완료 작업 확인");
		executorService.submit(new Runnable() { // 스레드 풀의 스레드에서 실행

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
					try {
						Future<Integer> future = completionService.take(); // 완료된 작업 가져오기, 안됐다면 블로킹
						int value = future.get(); // 논블로킹
						System.out.println("처리 결과: " + value);
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
