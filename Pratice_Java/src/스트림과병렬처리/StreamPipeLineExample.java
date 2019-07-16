package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(new Member("��", Member.FEAMLE, 25), new Member("ȫ", Member.MALE, 30),
				new Member("����", Member.FEAMLE, 49));

		double avg = list.stream().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average()
				.getAsDouble();
		System.out.println("���� ��� ����: " + avg);

	}

}
