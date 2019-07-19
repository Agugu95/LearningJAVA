package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<GroupingStudent> totallist = Arrays.asList(new GroupingStudent("강", 20, GroupingStudent.Sex.FEMALE),
				new GroupingStudent("신", 30, GroupingStudent.Sex.MALE),
				new GroupingStudent("애", 21, GroupingStudent.Sex.MALE));

		// 성별로 평균 점수를 저장하는 Map 얻기
		Map<GroupingStudent.Sex, Double> mapBySex = totallist.stream().collect(
				Collectors.groupingBy(GroupingStudent::getSex, Collectors.averagingDouble(GroupingStudent::getScore)));
		System.out.println(mapBySex); // Sex를 키로만 그룹핑 된 평균점수 맵
		System.out.println("남학생 평균 점수: " + mapBySex.get(GroupingStudent.Sex.MALE));
		System.out.println("여학생 평균 점수: " + mapBySex.get(GroupingStudent.Sex.FEMALE));

		// 성별을 쉼표로 구분한 이름을 저장하는 Map 얻기
		Map<GroupingStudent.Sex, String> mapByName = totallist.stream().collect(Collectors.groupingBy(
				GroupingStudent::getSex, Collectors.mapping(GroupingStudent::getName, Collectors.joining(","))));
		// Sex를 키로 가지고, Name으로 매핑과 순차 문자가 ","로 구분 된 문자열 리스트 값 가짐
		// joining은 delimiter(구분자) 를 순차 문자 중간에 삽입하여 문자열을 반환
		System.out.println(mapByName);
		System.out.println("남학생 전체 이름: " + mapByName.get(GroupingStudent.Sex.MALE));
		System.out.println("여학생 전체 이름: " + mapByName.get(GroupingStudent.Sex.FEMALE));
	}
}
