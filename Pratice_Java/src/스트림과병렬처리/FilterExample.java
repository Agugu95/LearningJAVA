package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("ȫ", "��", "��", "��", "��");

		list.stream().distinct().forEach(n -> System.out.println(n));

		System.out.println();

		list.stream().filter(n -> n.startsWith("��")).forEach(n -> System.out.println(n));
		System.out.println();

		list.stream().distinct().filter(n -> n.startsWith("��")).forEach(n -> System.out.println(n));
	}

}
