package �÷��ǹ���;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<>();

		set.add(new Student(1, "ȫ�浿"));
		set.add(new Student(2, "�ſ��"));
		set.add(new Student(1, "���ο�"));

		Iterator<Student> iterator = set.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student.studentNum + ":" + student.name);
		}
	}

}
