package ���ٽ�;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(new Student("ȫ�浿", 90, 96), new Student("�ſ���", 90, 93));

	public static void printString(Function<Student, String> function) {
		for (Student student : list) { // for-each�� list�� ����� �� ��ŭ ����
			System.out.println(function.apply(student) + " "); // ���ٽ� ����
		}
		System.out.println();
	}

	public static void printInt(ToIntFunction<Student> toIntFunction) {
		for (Student student : list) {
			System.out.println(toIntFunction.applyAsInt(student));
		}
		System.out.println();
	}

	public static void main(String args[]) {
		System.out.println("�л� �̸�");
		printString(t -> {
			return t.getName();
		});

		System.out.println("���� ����");
		printInt(t -> {
			return t.getEnglishScore();
		});

		System.out.println("���� ����");
		printInt(t -> {
			return t.getMathScore();
		});
	}
}
