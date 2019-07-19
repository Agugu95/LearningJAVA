package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import ��Ʈ��������ó��.StudentToList.City;
import ��Ʈ��������ó��.StudentToList.Sex;

public class GroupingByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentToList> list = Arrays.asList(new StudentToList("��", 20, StudentToList.Sex.FEMALE, City.Seoul),
				new StudentToList("��", 30, StudentToList.Sex.FEMALE, City.Busan),
				new StudentToList("��", 21, StudentToList.Sex.MALE, City.Busan),
				new StudentToList("��", 21, Sex.MALE, City.Seoul));
		System.out.println(list + "\n");

		Map<StudentToList.Sex, List<StudentToList>> mapBySex = list.stream() // sex�� Ű, ������ �� List ��ü�� ���� �� ��ü ����
				// MALE = { ��ü, ��ü }, FEMALE = { ��ü, ��ü }
				.collect(Collectors.groupingBy(StudentToList::getSex)); // �� ��ü�� list�� stream�� ���� sex���� �׷��� �� ����Ʈ ȹ��
		System.out.println("Sex�� �׷��� �� List" + mapBySex);
		System.out.println("[���л�] ");
		mapBySex.get(StudentToList.Sex.MALE).stream().forEach(s -> System.out.println(s.getName()));

		System.out.println("\n[���л�] ");
		mapBySex.get(StudentToList.Sex.FEMALE).stream().forEach(s -> System.out.println(s.getName()));

		System.out.println();
		Map<StudentToList.City, List<String>> mapByCity = list.stream().collect(Collectors
				.groupingBy(StudentToList::getCity, Collectors.mapping(StudentToList::getName, Collectors.toList())));
		// City {Busan�� Seoul} �� Ű�� ����, Value�� City�� �׷��� �� Name List<String>
		// �̸����� ���� �� ����Ʈ -> ���÷� �׷��� -> mapByCity <City, List<String>> ��ü�� City�� Ű�� ������,
		// �̸����� ���� �� ����Ʈ�� ������ ���� �� ��ü ����
		System.out.println(mapByCity);
		System.out.println("\n[����] ");
		mapByCity.get(StudentToList.City.Seoul).stream().forEach(s -> System.out.println(s));
		System.out.println("[�λ�] ");
		mapByCity.get(StudentToList.City.Busan).stream().forEach(s -> System.out.println(s));
	}

}
