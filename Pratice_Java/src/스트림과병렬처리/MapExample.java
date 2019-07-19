package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list = Arrays.asList(new Student("홍", 10), new Student("강", 20), new Student("신", 30));

		list.stream() // List 객체에 대한 스트림 (학생 이름과 점수를 모두 가지고 있음)
				.mapToInt(Student::getScore) // 클래스의 getScore메소드를 참조하는 메소드참조
				.forEach(n -> System.out.println(n)); // getScore를 통해 가져온 점수필드만으로 이루어진 스트림 n
	}

}
