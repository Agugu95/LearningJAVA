package 람다식;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class FunctionalExample2 {

	private static List<Student> list = Arrays.asList(new Student("가", 90, 23), new Student("나", 23, 35));

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double englishAng = avg(s -> {
			return s.getEnglishScore();
		});
		double mathScore = avg(s -> {
			return s.getMathScore();
		});
		System.out.println(englishAng + " " + mathScore);
	}

}
