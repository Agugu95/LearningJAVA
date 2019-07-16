package 스트림과병렬처리;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("홍", 90), new Student("강", 92)); // 객체 생성과 동시에 값을 주기 위함

		long startTime;
		long endTime;

		startTime = System.nanoTime();
		Iterator<Student> iterator = list.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			String name = student.getName();
			int score = student.getScore();
			System.out.println(name + " - " + score);
		}
		endTime = System.nanoTime();
		System.out.println("이터레이터: " + (endTime - startTime));

		startTime = System.nanoTime();
		Stream<Student> stream = list.stream(); // stream 객체 얻기
		stream.forEach(l -> {
			String name = l.getName();
			int score = l.getScore();
			System.out.println(name + " " + score);
		});
		endTime = System.nanoTime();
		System.out.println("스트림: " + (endTime - startTime));
	}

}
