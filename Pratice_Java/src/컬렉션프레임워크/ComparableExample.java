package 컬렉션프레임워크;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<>();

		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("홍순애", 225));
		treeSet.add(new Person("하피", 30));

		Iterator<Person> iterator = treeSet.iterator(); // treeset 이터레ㅣ터 객체 획득
		while (iterator.hasNext()) { // 이터레이터가 가져올 객체가 있다면 true
			Person person = iterator.next();
			System.out.println(person.name + "" + person.age);
		}
	}

}
