package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ��Ʈ��������ó��.StudentToList.Sex;

public class ToListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentToList> list = Arrays.asList(new StudentToList("��", 20, StudentToList.Sex.FEMALE),
				new StudentToList("��", 30, StudentToList.Sex.MALE),
				new StudentToList("��", 21, StudentToList.Sex.FEMALE));

		// ���л��鸸 filter �� List ��ü�� ��ȯ
		List<StudentToList> list2 = list.stream().filter(s -> s.getSex() == Sex.MALE).collect(Collectors.toList()); // toList��
																													// �̿�
		list2.stream().forEach(s -> System.out.println(s.getName()));

		System.out.println();

		// ���л��鸸 filter�� HashSet ����
		Set<StudentToList> list3 = list.stream().filter(s -> s.getSex() == Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet::new)); // ���ο� HashSet ��ü�� �����Ͽ� ����
		// set ��ȯ���ٰŴ� set Ÿ�� ����
		list3.stream().forEach(s -> System.out.println(s.getName()));
	}

}
