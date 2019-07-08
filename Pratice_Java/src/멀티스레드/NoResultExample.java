package 멀티스레드;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// CPU의 코어가 할당 할 수 있는 스레드 수 만큼 스레드 풀 생성

		System.out.println("작업 처리 요청");
		Runnable runnable = new Runnable() { // Runnable 인터페이스 익명구현 객체
			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				System.out.println("처리 결과: " + sum);
			}
		};
		Future future = executorService.submit(runnable); // submit()은 받은 runnable/callable 작업을 스레드 풀의 작업 큐에 저장 후
															// future반환 결과값이 없지만 에외처리를 위한 future객체

		try {
			future.get();
			System.out.println("작업 처리 완료");
		} catch (Exception e) {
			System.out.println("실행 예외 발생함" + e.getMessage());
		}
		executorService.shutdown();
	}

}
