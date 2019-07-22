package 스트림문제;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExampleCollect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(new Member("홍", "개발자"), new Member("김", "디자이너"), new Member("신", "개발자"));

		List<Member> developer = list.stream().filter(a -> a.getJob() == "개발자").collect(Collectors.toList());
		// Collectors 객체는 collect를 구현하고 있음
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
