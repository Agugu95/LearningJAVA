package 스트림문제;

import java.util.Arrays;
import java.util.List;

public class StreamExampleAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> memberList = Arrays.asList(new Member("강", 30), new Member("신", 40), new Member("박", 26));

		double avg = memberList.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
		System.out.println("평균 나이: " + avg);
	}

}
