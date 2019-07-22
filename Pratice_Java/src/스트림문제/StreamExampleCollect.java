package ��Ʈ������;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(new Member("ȫ", "������"), new Member("��", "�����̳�"), new Member("��", "������"));

		List<Member> developer = list.stream().filter(a -> a.getJob() == "������").collect(Collectors.toList());
		// Collectors ��ü�� collect�� �����ϰ� ����
		developer.stream().forEach(s -> System.out.println(s.getName()));
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
