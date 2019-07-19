package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.OptionalDouble;

public class AggregateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// count ����
		long count = Arrays.stream(new int[] { 1, 2, 3, 4, 5, }).filter(n -> n % 2 == 0).count();
		System.out.println("2�� ��� ����: " + count);

		// sum ����
		int total = Arrays.stream(new int[] { 1, 2, 3, 4, 5 }).filter(n -> n % 2 == 0).sum();
		System.out.println("2�� ��� �հ�: " + total);

		int[] intArr = { 1, 2, 3, 4, 5 };

		// avg ����
		OptionalDouble avg = Arrays.stream(intArr).filter(n -> n % 2 == 0).average();
		System.out.println("2�� ��� ���: " + avg.getAsDouble());

		// max ����
		int max = Arrays.stream(intArr).filter(n -> n % 2 == 0).max().getAsInt();
		System.out.println("2�� ��� �ִ�: " + max);

		// min ����
		int min = Arrays.stream(intArr).filter(n -> n % 2 == 0).min().getAsInt();
		System.out.println("2�� ��� �ּ�: " + min);

		// first ����
		int first = Arrays.stream(intArr).filter(n -> n % 2 == 0).findFirst().getAsInt();
		System.out.println("2�� ��� ù��°: " + first);
	}

}
