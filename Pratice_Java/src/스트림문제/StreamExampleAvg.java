package ��Ʈ������;

import java.util.Arrays;
import java.util.List;

public class StreamExampleAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> memberList = Arrays.asList(new Member("��", 30), new Member("��", 40), new Member("��", 26));

		double avg = memberList.stream().mapToInt(a -> a.getAge()).average().getAsDouble();
		System.out.println("��� ����: " + avg);
	}

}
