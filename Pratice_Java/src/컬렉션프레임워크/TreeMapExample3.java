package 컬렉션프레임워크;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("apple", new Integer(10));
		treeMap.put("forever", new Integer(60));
		treeMap.put("des", new Integer(50));
		treeMap.put("ever", new Integer(70));

		System.out.println("c - f사이");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		for (Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry);
		}
	}

}
