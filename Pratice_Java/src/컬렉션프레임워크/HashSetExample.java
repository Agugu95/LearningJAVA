package �÷��������ӿ�ũ;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();

		set.add("Java");
		set.add("JDBC");
		set.add("Servelt/JSP");
		set.add("Java");
		set.add("iBATIS");

		int size = set.size();
		System.out.println("�� ��ü ��: " + size);

		Iterator<String> iterator = set.iterator(); // set�� ���� ���ͷ�����
		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		set.clear();
		System.out.println(set.isEmpty());
	}

}
