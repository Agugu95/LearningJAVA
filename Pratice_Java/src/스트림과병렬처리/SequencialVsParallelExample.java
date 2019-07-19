package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;

public class SequencialVsParallelExample {

	// ��� ó��
	public static void work(int value) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	// ���� ó��
	public static long testSequencial(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().forEach((a) -> work(a));
		long end = System.nanoTime();
		long runtime = end - start;
		return runtime;
	}

	// ���� ó��
	public static long testParallel(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach((a) -> work(a));
		long end = System.nanoTime();
		long runtime = end - start;
		return runtime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �� ���÷���
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

		// ���� ó�� ��Ʈ�� �ð� ���ϱ�
		long timeSequencial = testSequencial(list);

		// ���� ó�� ��Ʈ�� �ð� ���ϱ�
		long timeParallel = testParallel(list);

		// ��
		System.out.println("����ó�� �ð�: " + timeParallel);
		System.out.println("����ó�� �ð�: " + timeSequencial);
	}
}
