package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import 스트림과병렬처리.StudentToList.City;
import 스트림과병렬처리.StudentToList.Sex;

public class GroupingByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentToList> list = Arrays.asList(new StudentToList("강", 20, StudentToList.Sex.FEMALE, City.Seoul),
				new StudentToList("신", 30, StudentToList.Sex.FEMALE, City.Busan),
				new StudentToList("애", 21, StudentToList.Sex.MALE, City.Busan),
				new StudentToList("박", 21, Sex.MALE, City.Seoul));
		System.out.println(list + "\n");

		Map<StudentToList.Sex, List<StudentToList>> mapBySex = list.stream() // sex를 키, 값으로 각 List 객체를 가진 맵 객체 생성
				// MALE = { 객체, 객체 }, FEMALE = { 객체, 객체 }
				.collect(Collectors.groupingBy(StudentToList::getSex)); // 맵 객체는 list를 stream을 통해 sex별로 그룹핑 된 리스트 획득
		System.out.println("Sex로 그룹핑 된 List" + mapBySex);
		System.out.println("[남학생] ");
		mapBySex.get(StudentToList.Sex.MALE).stream().forEach(s -> System.out.println(s.getName()));

		System.out.println("\n[여학생] ");
		mapBySex.get(StudentToList.Sex.FEMALE).stream().forEach(s -> System.out.println(s.getName()));

		System.out.println();
		Map<StudentToList.City, List<String>> mapByCity = list.stream().collect(Collectors
				.groupingBy(StudentToList::getCity, Collectors.mapping(StudentToList::getName, Collectors.toList())));
		// City {Busan과 Seoul} 로 키를 구성, Value는 City로 그룹핑 된 Name List<String>
		// 이름으로 매핑 된 리스트 -> 도시로 그룹핑 -> mapByCity <City, List<String>> 객체로 City를 키로 가지며,
		// 이름으로 매핑 된 리스트를 값으로 가진 맵 객체 생성
		System.out.println(mapByCity);
		System.out.println("\n[서울] ");
		mapByCity.get(StudentToList.City.Seoul).stream().forEach(s -> System.out.println(s));
		System.out.println("[부산] ");
		mapByCity.get(StudentToList.City.Busan).stream().forEach(s -> System.out.println(s));
	}

}
