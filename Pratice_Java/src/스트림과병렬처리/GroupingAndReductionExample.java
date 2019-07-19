package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GroupingStudent> totallist = Arrays.asList(new GroupingStudent("��", 20, GroupingStudent.Sex.FEMALE),
				new GroupingStudent("��", 30, GroupingStudent.Sex.MALE),
				new GroupingStudent("��", 21, GroupingStudent.Sex.MALE));

		// ������ ��� ������ �����ϴ� Map ���
		Map<GroupingStudent.Sex, Double> mapBySex = totallist.stream().collect(
				Collectors.groupingBy(GroupingStudent::getSex, Collectors.averagingDouble(GroupingStudent::getScore)));
		System.out.println(mapBySex); // Sex�� Ű�θ� �׷��� �� ������� ��
		System.out.println("���л� ��� ����: " + mapBySex.get(GroupingStudent.Sex.MALE));
		System.out.println("���л� ��� ����: " + mapBySex.get(GroupingStudent.Sex.FEMALE));

		// ������ ��ǥ�� ������ �̸��� �����ϴ� Map ���
		Map<GroupingStudent.Sex, String> mapByName = totallist.stream().collect(Collectors.groupingBy(
				GroupingStudent::getSex, Collectors.mapping(GroupingStudent::getName, Collectors.joining(","))));
		// Sex�� Ű�� ������, Name���� ���ΰ� ���� ���ڰ� ","�� ���� �� ���ڿ� ����Ʈ �� ����
		// joining�� delimiter(������) �� ���� ���� �߰��� �����Ͽ� ���ڿ��� ��ȯ
		System.out.println(mapByName);
		System.out.println("���л� ��ü �̸�: " + mapByName.get(GroupingStudent.Sex.MALE));
		System.out.println("���л� ��ü �̸�: " + mapByName.get(GroupingStudent.Sex.FEMALE));
	}
}
