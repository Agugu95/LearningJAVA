package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("ȫ", 10), new Student("��", 20), new Student("��", 30));

		list.stream() // List ��ü�� ���� ��Ʈ�� (�л� �̸��� ������ ��� ������ ����)
				.mapToInt(Student::getScore) // Ŭ������ getScore�޼ҵ带 �����ϴ� �޼ҵ�����
				.forEach(n -> System.out.println(n)); // getScore�� ���� ������ �����ʵ常���� �̷���� ��Ʈ�� n
	}

}
