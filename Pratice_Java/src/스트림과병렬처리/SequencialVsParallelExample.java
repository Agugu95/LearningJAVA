package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelExample {

	// 요소 처리
	public static void work(int value) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	// 순차 처리
	public static long testSequencial(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().forEach((a) -> work(a));
		long end = System.nanoTime();
		long runtime = end - start;
		return runtime;
	}

	// 병렬 처리
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach((a) -> work(a));
		long end = System.nanoTime();
		long runtime = end - start;
		return runtime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 솟 ㅡ컬렉션
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		// 순차 처리 스트림 시간 구하기
		long timeSequencial = testSequencial(list);

		// 병렬 처리 스트림 시간 구하기
		long timeParallel = testParallel(list);

		// 비교
		System.out.println("병렬처리 시간: " + timeParallel);
		System.out.println("순차처리 시간: " + timeSequencial);
	}
}
