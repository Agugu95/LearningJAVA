package 스트림문제;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	// List에 저장 된 String 요소에서 대소문자 상관없이 "java" 문자열을 필터링하여 포함 문자열 최종 출력

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("This is a java book", "Lambda Expressions",
				"Java8 supports lambda expressions");
		System.out.println("원본: " + list);
		String str = "This is a java book";
		System.out.println(str.equals("This is a java book"));
		list.stream().filter(a -> a.toUpperCase().contains("JAVA")).forEach(a -> System.out.println(a));
	}

}
