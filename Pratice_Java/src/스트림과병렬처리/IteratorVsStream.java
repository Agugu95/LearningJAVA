package ��Ʈ��������ó��;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("ȫ�浿", "�ſ��", "���ڹ�");

		// Iterator
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		System.out.println();

		// Stream
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.println(s));
	}

}
