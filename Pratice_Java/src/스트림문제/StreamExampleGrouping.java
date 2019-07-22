package 스트림문제;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExampleGrouping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Member> list = Arrays.asList(new Member("홍길동", "개발자"), new Member("김나리", "디자이너"),
				new Member("신용권", "개발자"));
		Map<String, List<String>> groupingMap = list.stream() // 스트림 얻기
				.collect( // collect 수집 메소드
						Collectors.groupingBy(Member::getJob, // 매핑 된 리스트를 getJob으로 그룹핑
								Collectors.mapping(Member::getName, // 이름으로만 매핑 된 요소
										Collectors.toList()))); // 매핑 된 리스트
		//
		System.out.println("[개발자]");
		groupingMap.get("개발자").stream().forEach(s -> System.out.print(s + " "));
		System.out.println("\n[디자이너]");
		groupingMap.get("디자이너").stream().forEach(s -> System.out.print(s + " "));
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
