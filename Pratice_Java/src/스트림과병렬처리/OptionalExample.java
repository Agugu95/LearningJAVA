package 스트림과병렬처리;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(); // 빈 리스트 생성

		// 예외 발생 스트림
		try {
			double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		} catch (Exception e) {
			System.out.println(e); // 값이 없으므로 NoSuchElementException
		}

		// isPresent를 이용한 t/f 판별
		OptionalDouble double1 = list.stream().mapToInt(Integer::intValue).average();
		if (double1.isPresent()) {
			System.out.println("isPresnet: " + double1.getAsDouble());
		} else
			System.out.println("isPresent: false ");

		// orElse default 값 이용
		double avg2 = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("orElse: " + avg2);

		// ifPresnet 람다식이용
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a -> System.out.println("ifPresent :" + a));
	}

}
