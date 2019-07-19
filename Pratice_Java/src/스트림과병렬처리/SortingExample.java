package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ��� ����
		IntStream intStream = Arrays.stream(new int[] { 5, 3, 4, 8, 2 }); // ��Ʈ�� ���� �� �ٷ� �迭��ü �־ �� ������
		intStream.sorted().forEach(n -> System.out.println(n)); // ������������ ���� �� ��Ʈ�� ��ȯ
		System.out.println();

		// ��ü ��� ����
		List<StudentComparable> list = Arrays.asList(new StudentComparable("ȫ", 30), new StudentComparable("��", 21),
				new StudentComparable("��", 92));

		list.stream().sorted().forEach(n -> System.out.println(n.getScore()));
		System.out.println();

		// ��ü ��� ���� ���� (��������)
		list.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n.getScore()));

	}

}
