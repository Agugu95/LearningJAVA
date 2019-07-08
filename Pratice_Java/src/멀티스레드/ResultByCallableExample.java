package 멀티스레드;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// 코어가 생성할 수 있는 스레드 수 만큼 스레드 풀 생성

		System.out.println("작업 처리 요청");
		Callable<Integer> task = new Callable<Integer>() { // 반환값이 있는 Callable 객체 생성
			// Callable 객체는 반환값의 T 타입을 가져야함
			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				int sum = 0;
				for (int i = 0; i <= 10; i++) {
					sum += i;
				}
				return sum; // integer 반환
			}
		};
		Future<Integer> future = executorService.submit(task); // 객체를 스레드 풀의 작업 큐에 등록 후 future 객체 반환

		try {
			int sum = future.get(); // 블로킹 객체로 작업이 완료 시 처리 결과 V를 리턴
			// submit을 통해 등록한 Callable 객체의 call() 메소드 작업이 종료 될 시
			// 블로킹 되어 있던 get()메소드 실행, T타입의 값 Integer 반환
			System.out.println("처리결과: " + sum);
			System.out.println("작업 처리 완료");
		} catch (Exception e) {
			System.out.println("실행 예외 발생" + e.getMessage());
		}
		executorService.shutdown();
	}

}
