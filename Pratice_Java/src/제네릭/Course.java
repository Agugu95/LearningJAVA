package ���׸�;

public class Course<T> { // ���׸� Ŭ����
	private String name;
	private T[] students; // ���׸� Ÿ�� �迭

	public Course(String name, int capacity) {
		this.name = name;
		students = (T[]) (new Object[capacity]); // (T[]) (new Object[n]) �������� ����
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
