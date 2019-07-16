package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("홍", "신", "애", "람다", "박병렬");

		// 순차 처리
		Stream<String> stream = list.stream();
		stream.forEach(ParallelExample::print);
		System.out.println();

		// 병렬 처리
		Stream<String> paralleStream = list.parallelStream();
		paralleStream.forEach(ParallelExample::print);
	}

	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}
}
