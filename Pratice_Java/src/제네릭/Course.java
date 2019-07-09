package 제네릭;

public class Course<T> { // 제네릭 클래스
	private String name;
	private T[] students; // 제네릭 타입 배열

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]); // (T[]) (new Object[n]) 형식으로 생성
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

}
