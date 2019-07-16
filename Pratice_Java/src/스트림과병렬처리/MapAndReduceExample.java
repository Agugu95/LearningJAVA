package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = Arrays.asList(new Student("ȫ", 10), new Student("��", 20), new Student("����", 30));

		double avg = studentList.stream() // ��Ʈ�� ��ü
				// �߰� ó�� ��Ʈ�� (������)
				.mapToInt(Student::getScore) // getScore�� ���� score �ʵ� -> avg ���� (int)
				// ���� ó�� ��Ʈ��
				.average().getAsDouble(); // ��հ� ���� �� double������ ������

		System.out.println(avg);

	}

}
