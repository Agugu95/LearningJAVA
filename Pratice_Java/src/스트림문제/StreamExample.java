package ��Ʈ������;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	// List�� ���� �� String ��ҿ��� ��ҹ��� ������� "java" ���ڿ��� ���͸��Ͽ� ���� ���ڿ� ���� ���

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("This is a java book", "Lambda Expressions",
				"Java8 supports lambda expressions");
		System.out.println("����: " + list);
		String str = "This is a java book";
		System.out.println(str.equals("This is a java book"));
		list.stream().filter(a -> a.toUpperCase().contains("JAVA")).forEach(a -> System.out.println(a));
	}

}
