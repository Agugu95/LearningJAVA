package 스트림과병렬처리;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<StudentToList> list; // 요소를 저장할 컬렉션

	public MaleStudent() {
		list = new ArrayList<StudentToList>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}

	public void accumulator(StudentToList stlist) { // 요소 수집 메소드
		list.add(stlist);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulator");
	}

	public void combine(MaleStudent other) { // 두 MaleStudent를 결합하는 메소드(병렬처리)
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}

	public List<StudentToList> getList() { // 요소가 저장 된 컬렉션 리턴
		return list;
	}
}
