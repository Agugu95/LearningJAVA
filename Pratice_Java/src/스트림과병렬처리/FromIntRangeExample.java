package 스트림과병렬처리;

import java.util.stream.IntStream;

public class FromIntRangeExample {
	public static int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntStream intStream = IntStream.rangeClosed(1, 100); // 1과 100을 포함한 범위 스트림
		intStream.forEach(a -> {

			sum += a;
		});
		System.out.println(sum);
	}

}
