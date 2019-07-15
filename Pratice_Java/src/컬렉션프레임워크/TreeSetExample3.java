package 컬렉션프레임워크;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");

		System.out.println("b ~ e");
		NavigableSet<String> rangeSet = set.subSet("b", false, "e", true);
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}

}
