package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentComparable> list = Arrays.asList(new StudentComparable("홍", 30), new StudentComparable("강", 21),
				new StudentComparable("신", 92));
		IntStream intStream = Arrays.stream(new int[] { 5, 3, 4, 8, 2 });

		System.out.println("peek() 를 마지막에 호출한 경우");
		intStream.filter(a -> a % 2 == 0).peek(n -> System.out.println(n));

		System.out.println("peek()를 중간처리, sum() 최종 집계 메소드 사용한 경우");
		intStream = Arrays.stream(new int[] { 5, 3, 4, 8, 2 });
		int total = intStream.filter(a -> a % 2 == 0).peek(n -> System.out.println(n)).sum();
		System.out.println(total);

		System.out.println("forEach() 최종 처리 메소드를 호출한 경우");
		intStream = Arrays.stream(new int[] { 5, 3, 4, 8, 2 });
		intStream.filter(a -> a % 2 == 0).forEach(n -> System.out.println(n));

	}

}
