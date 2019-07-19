package 스트림과병렬처리;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import 스트림과병렬처리.StudentToList.Sex;

public class ToListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentToList> list = Arrays.asList(new StudentToList("강", 20, StudentToList.Sex.FEMALE),
				new StudentToList("신", 30, StudentToList.Sex.MALE),
				new StudentToList("애", 21, StudentToList.Sex.FEMALE));

		// 남학생들만 filter 후 List 객체로 반환
		List<StudentToList> list2 = list.stream().filter(s -> s.getSex() == Sex.MALE).collect(Collectors.toList()); // toList를
																													// 이용
		list2.stream().forEach(s -> System.out.println(s.getName()));

		System.out.println();

		// 여학생들만 filter로 HashSet 생성
		Set<StudentToList> list3 = list.stream().filter(s -> s.getSex() == Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet::new)); // 새로운 HashSet 객체를 생성하여 제공
		// set 반환해줄거니 set 타입 변수
		list3.stream().forEach(s -> System.out.println(s.getName()));
	}

}
