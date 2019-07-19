package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;

import ��Ʈ��������ó��.StudentToList.Sex;

public class MaleStudnetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StudentToList> list = Arrays.asList(new StudentToList("��", 20, StudentToList.Sex.FEMALE),
				new StudentToList("��", 30, StudentToList.Sex.MALE),
				new StudentToList("��", 21, StudentToList.Sex.FEMALE));

		MaleStudent maleStudent = list.stream().filter(m -> m.getSex() == Sex.MALE).collect(MaleStudent::new,
				MaleStudent::accumulator, MaleStudent::combine);

		maleStudent.getList().stream().forEach(n -> System.out.println(n.getName()));
	}

}
