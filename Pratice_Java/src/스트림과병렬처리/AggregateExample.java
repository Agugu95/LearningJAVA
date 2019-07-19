package 스트림과병렬처리;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count 집계
		long count = Arrays.stream(new int[] { 1, 2, 3, 4, 5, }).filter(n -> n % 2 == 0).count();
		System.out.println("2의 배수 개수: " + count);

		// sum 집계
		int total = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(n -> n % 2 == 0).sum();
		System.out.println("2의 배수 합계: " + total);

		int[] intArr = { 1, 2, 3, 4, 5 };

		// avg 집계
		OptionalDouble avg = Arrays.stream(intArr).filter(n -> n % 2 == 0).average();
		System.out.println("2의 배수 평균: " + avg.getAsDouble());

		// max 집계
		int max = Arrays.stream(intArr).filter(n -> n % 2 == 0).max().getAsInt();
		System.out.println("2의 배수 최대: " + max);

		// min 집계
		int min = Arrays.stream(intArr).filter(n -> n % 2 == 0).min().getAsInt();
		System.out.println("2의 배수 최소: " + min);

		// first 집계
		int first = Arrays.stream(intArr).filter(n -> n % 2 == 0).findFirst().getAsInt();
		System.out.println("2의 배수 첫번째: " + first);
	}

}
