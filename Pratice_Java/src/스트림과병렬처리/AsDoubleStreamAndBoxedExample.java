package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.stream.IntStream;

public class AsDoubleStreamAndBoxedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = { 10, 20, 30, 40, 50 };

		// int array�� Arrays.stream �� ����Ͽ� intStream���� ���������Ͽ� ��ȯ
		IntStream intStream = Arrays.stream(intArr);
		intStream.asDoubleStream().forEach(System.out::println); // intStream�� doubleStream���� ��ȯ

		System.out.println();

		intStream = Arrays.stream(intArr); // int array���� intStream ��ȯ
		intStream.boxed().forEach(obj -> System.out.println(obj.intValue())); // intStream�� boxed �޼ҵ�� wrapping�Ͽ�
																				// Stream<Integer> ����
		// <Integer> Ÿ������ ���� �� ��ü(Integer)���� intValue���� ����

	}

}
