package ��Ʈ������;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExampleGrouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(new Member("ȫ�浿", "������"), new Member("�質��", "�����̳�"),
				new Member("�ſ��", "������"));
		Map<String, List<String>> groupingMap = list.stream() // ��Ʈ�� ���
				.collect( // collect ���� �޼ҵ�
						Collectors.groupingBy(Member::getJob, // ���� �� ����Ʈ�� getJob���� �׷���
								Collectors.mapping(Member::getName, // �̸����θ� ���� �� ���
										Collectors.toList()))); // ���� �� ����Ʈ
		//
		System.out.println("[������]");
		groupingMap.get("������").stream().forEach(s -> System.out.print(s + " "));
		System.out.println("\n[�����̳�]");
		groupingMap.get("�����̳�").stream().forEach(s -> System.out.print(s + " "));
	}

	static class Member {
		private String name;
		private String job;

		public Member(String name, String job) {
			this.name = name;
			this.job = job;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}
	}

}
