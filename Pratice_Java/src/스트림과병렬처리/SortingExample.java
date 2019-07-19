package 스트림과병렬처리;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 숫자 요소 정렬
		IntStream intStream = Arrays.stream(new int[] { 5, 3, 4, 8, 2 }); // 스트림 생성 시 바로 배열객체 넣어도 됨 ㄷㄷㄷ
		intStream.sorted().forEach(n -> System.out.println(n)); // 오름차순으로 정렬 된 스트림 반환
		System.out.println();

		// 객체 요소 정렬
		List<StudentComparable> list = Arrays.asList(new StudentComparable("홍", 30), new StudentComparable("강", 21),
				new StudentComparable("신", 92));

		list.stream().sorted().forEach(n -> System.out.println(n.getScore()));
		System.out.println();

		// 객체 요소 역순 정렬 (내림차순)
		list.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.println(n.getScore()));

	}

}
