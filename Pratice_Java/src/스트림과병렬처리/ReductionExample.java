package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("홍", 10), new Student("강", 20), new Student("신", 30));

		// sum 이용 집계
		int sum1 = list.stream().mapToInt(Student::getScore).sum();

		// reduce(BinaryOperator<Integer> accumulator) 이용
		int sum2 = list.stream().mapToInt(Student::getScore).reduce((a, b) -> a + b).getAsInt();

		// reduce(int idenity, IntBinaryOperator op) 이용
		int sum3 = list.stream().mapToInt(Student::getScore).reduce(0, (a, b) -> a + b);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}
