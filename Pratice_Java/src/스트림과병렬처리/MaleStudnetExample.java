package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;

import ��Ʈ��������ó��.StudentToList.Sex;

public class MaleStudnetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ó�� ��Ʈ��(���� ������ 1��)������ �����ڰ� �ѹ��� ȣ��
		List<StudentToList> list = Arrays.asList(new StudentToList("��", 20, StudentToList.Sex.FEMALE),
				new StudentToList("��", 30, StudentToList.Sex.MALE), new StudentToList("��", 21, StudentToList.Sex.MALE));

		// 3���� �÷��� ��ü�� �����ϰ� ��ü�� ��Ʈ������ MALE�� ����
		// collect �� ���� (supplier, accumulator, combine) ����
		// ��Ʈ�� ���͸� ���ؼ� ���� �� MALE ��ü�� accumulator�� ���� supplier�� �߰�
		MaleStudent maleStudent = list.stream().filter(m -> m.getSex() == Sex.MALE).collect(MaleStudent::new,
				MaleStudent::accumulator, MaleStudent::combine);

		// ��Ʈ���� ���� ��ü ó���� ��ġ��, �����̳ʿ� ���� �� �÷����� ��� ����
		// ��ȯ ���� maleStudent(���� ����� �����̳ʰ� �������)���� getList�޼ҵ带 ���� List�� ����(����)
		// Stream���� �ٽ� �����Ͽ� ���ٽ� ����
		maleStudent.getList().stream().forEach(n -> System.out.println(n.getName()));
	}

}
