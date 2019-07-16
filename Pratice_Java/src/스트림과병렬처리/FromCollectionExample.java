package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("람다", 10), new Student("강", 20), new Student("홍", 30));
		String arr[] = { "a", "b", "c" };

		// stream 얻기
		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			System.out.println(s.getName() + " " + s.getScore());
		});

		// 배열 stream 얻기
		Stream<String> stream2 = Arrays.stream(arr); // 배열 클래스 내 스트림 메소드
		stream2.forEach(a -> {
			System.out.println(a);
		});
	}

}
