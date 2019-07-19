package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("ȫ", 10), new Student("��", 20), new Student("��", 30));

		// sum �̿� ����
		int sum1 = list.stream().mapToInt(Student::getScore).sum();

		// reduce(BinaryOperator<Integer> accumulator) �̿�
		int sum2 = list.stream().mapToInt(Student::getScore).reduce((a, b) -> a + b).getAsInt();

		// reduce(int idenity, IntBinaryOperator op) �̿�
		int sum3 = list.stream().mapToInt(Student::getScore).reduce(0, (a, b) -> a + b);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}
