package �÷��������ӿ�ũ;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<>();

		treeSet.add(new Person("ȫ�浿", 45));
		treeSet.add(new Person("ȫ����", 225));
		treeSet.add(new Person("����", 30));

		Iterator<Person> iterator = treeSet.iterator(); // treeset ���ͷ����� ��ü ȹ��
		while (iterator.hasNext()) { // ���ͷ����Ͱ� ������ ��ü�� �ִٸ� true
			Person person = iterator.next();
			System.out.println(person.name + "" + person.age);
		}
	}

}
