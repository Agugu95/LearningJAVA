package 컬렉션프레임워크;

import java.util.Comparator;

import 람다식.Fruit;

public class DecendingComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		if (o1.price < o2.price) {
			return 1;
		} else if (o1.price == o2.price) {
			return 0;
		} else
			return -1;
	}

}
