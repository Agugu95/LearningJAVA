package 스트림과병렬처리;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 10, 20, 30, 40, 50 };

		// int array를 Arrays.stream 을 사용하여 intStream으로 순차리턴하여 반환
		IntStream intStream = Arrays.stream(intArr);
		intStream.asDoubleStream().forEach(System.out::println); // intStream을 doubleStream으로 변환

		System.out.println();

		intStream = Arrays.stream(intArr); // int array에서 intStream 반환
		intStream.boxed().forEach(obj -> System.out.println(obj.intValue())); // intStream을 boxed 메소드로 wrapping하여
																				// Stream<Integer> 생성
		// <Integer> 타입으로 랩핑 된 객체(Integer)에서 intValue값만 추출

	}

}
