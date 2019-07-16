package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("ȫ", 90), new Student("��", 92)); // ��ü ������ ���ÿ� ���� �ֱ� ����

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			String name = student.getName();
			int score = student.getScore();
			System.out.println(name + " - " + score);
		}
		endTime = System.nanoTime();
		System.out.println("���ͷ�����: " + (endTime - startTime));

		startTime = System.nanoTime();
		Stream<Student> stream = list.stream(); // stream ��ü ���
		stream.forEach(l -> {
			String name = l.getName();
			int score = l.getScore();
			System.out.println(name + " " + score);
		});
		endTime = System.nanoTime();
		System.out.println("��Ʈ��: " + (endTime - startTime));
	}

}
