package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("����", 10), new Student("��", 20), new Student("ȫ", 30));
		String arr[] = { "a", "b", "c" };

		// stream ���
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			System.out.println(s.getName() + " " + s.getScore());
		});

		// �迭 stream ���
		Stream<String> stream2 = Arrays.stream(arr); // �迭 Ŭ���� �� ��Ʈ�� �޼ҵ�
		stream2.forEach(a -> {
			System.out.println(a);
		});
	}

}
