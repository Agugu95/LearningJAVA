package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> studentList = Arrays.asList(new Student("홍", 10), new Student("강", 20), new Student("람다", 30));

		double avg = studentList.stream() // 스트림 객체
				// 중간 처리 스트림 (파이프)
				.mapToInt(Student::getScore) // getScore를 통한 score 필드 -> avg 매핑 (int)
				// 최종 처리 스트림
				.average().getAsDouble(); // 평균값 산출 및 double형으로 가져옴

		System.out.println(avg);

	}

}
