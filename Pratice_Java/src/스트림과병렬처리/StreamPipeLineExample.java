package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(new Member("강", Member.FEAMLE, 25), new Member("홍", Member.MALE, 30),
				new Member("람다", Member.FEAMLE, 49));

		double avg = list.stream().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average()
				.getAsDouble();
		System.out.println("남자 평균 나이: " + avg);

	}

}
