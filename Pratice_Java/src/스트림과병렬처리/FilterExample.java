package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("홍", "신", "감", "신", "신");

		list.stream().distinct().forEach(n -> System.out.println(n));

		System.out.println();

		list.stream().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
		System.out.println();

		list.stream().distinct().filter(n -> n.startsWith("신")).forEach(n -> System.out.println(n));
	}

}
