package �÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String args[]) {
		List<String> list = new ArrayList<>();

		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "DataBase");
		list.add("iBATIS");

		int size = list.size();
		System.out.println("�� ��ü �� : " + size);
		System.out.println();

		String skill = list.get(2);
		System.out.println("2�� �ε���: " + skill);
		System.out.println();

		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		System.out.println();

		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
	}
}