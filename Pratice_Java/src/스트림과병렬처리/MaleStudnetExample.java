package 스트림과병렬처리;

import java.util.Arrays;
import java.util.List;

import 스트림과병렬처리.StudentToList.Sex;

public class MaleStudnetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 순차 처리 스트림(메인 스레드 1개)에서는 생성자가 한번만 호출
		List<StudentToList> list = Arrays.asList(new StudentToList("강", 20, StudentToList.Sex.FEMALE),
				new StudentToList("신", 30, StudentToList.Sex.MALE), new StudentToList("애", 21, StudentToList.Sex.MALE));

		// 3개의 컬렉션 객체를 생성하고 객체를 스트림으로 MALE만 집계
		// collect 를 통해 (supplier, accumulator, combine) 실행
		// 스트림 필터를 통해서 집계 된 MALE 객체만 accumulator를 통해 supplier에 추가
		MaleStudent maleStudent = list.stream().filter(m -> m.getSex() == Sex.MALE).collect(MaleStudent::new,
				MaleStudent::accumulator, MaleStudent::combine);

		// 스트림을 통한 객체 처리를 마치고, 컨테이너에 병합 된 컬렉션이 들어 있음
		// 반환 받은 maleStudent(현재 사용자 컨테이너가 들어있음)에서 getList메소드를 통해 List만 추출(리턴)
		// Stream으로 다시 연결하여 람다식 수행
		maleStudent.getList().stream().forEach(n -> System.out.println(n.getName()));
	}

}
