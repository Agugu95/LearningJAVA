package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;

import 스트림과병렬처리.StudentToList.Sex;

public class ParallelMaleStudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentToList> list = Arrays.asList(new StudentToList("강", 20, StudentToList.Sex.FEMALE),
				new StudentToList("신", 30, StudentToList.Sex.MALE), new StudentToList("애", 21, StudentToList.Sex.MALE),
				new StudentToList("박", 52, Sex.FEMALE));

		MaleStudent maleStudent = list.parallelStream().filter(s -> s.getSex() == Sex.MALE).collect(MaleStudent::new,
				MaleStudent::accumulator, MaleStudent::combine);
		maleStudent.getList().stream().forEach(s -> System.out.println(s.getName()));
	}

}
