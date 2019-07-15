package �÷��������ӿ�ũ;

import java.util.Iterator;
import java.util.TreeSet;

import ���ٽ�.Fruit;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Fruit> treeSet = new TreeSet<>(new DecendingComparator()); // ������ ��ü
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + fruit.price);
		}
	}

}
