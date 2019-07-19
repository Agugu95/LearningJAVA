package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LoopingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentComparable> list = Arrays.asList(new StudentComparable("ȫ", 30), new StudentComparable("��", 21),
				new StudentComparable("��", 92));
		IntStream intStream = Arrays.stream(new int[] { 5, 3, 4, 8, 2 });

		System.out.println("peek() �� �������� ȣ���� ���");
		intStream.filter(a -> a % 2 == 0).peek(n -> System.out.println(n));

		System.out.println("peek()�� �߰�ó��, sum() ���� ���� �޼ҵ� ����� ���");
		intStream = Arrays.stream(new int[] { 5, 3, 4, 8, 2 });
		int total = intStream.filter(a -> a % 2 == 0).peek(n -> System.out.println(n)).sum();
		System.out.println(total);

		System.out.println("forEach() ���� ó�� �޼ҵ带 ȣ���� ���");
		intStream = Arrays.stream(new int[] { 5, 3, 4, 8, 2 });
		intStream.filter(a -> a % 2 == 0).forEach(n -> System.out.println(n));

	}

}
