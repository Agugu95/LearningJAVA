package 람다식;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample1 {
	private static List<Student> list = Arrays.asList(new Student("홍길동", 90, 96), new Student("신용재", 90, 93));

	public static void printString(Function<Student, String> function) {
		for (Student student : list) { // for-each문 list에 저장된 수 만큼 루핑
			System.out.println(function.apply(student) + " "); // 람다식 실행
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
		System.out.println("학생 이름");
		printString(t -> {
			return t.getName();
		});

		System.out.println("영어 점수");
		printInt(t -> {
			return t.getEnglishScore();
		});

		System.out.println("수학 점수");
		printInt(t -> {
			return t.getMathScore();
		});
	}
}
