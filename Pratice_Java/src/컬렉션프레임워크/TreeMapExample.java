package 컬렉션프레임워크;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("홍길동", new Integer(87));
		treeMap.put("이인수", new Integer(10));
		treeMap.put("기릴ㄹ", new Integer(25));

		Map.Entry<String, Integer> entry = null;

		entry = treeMap.firstEntry();
		System.out.println("가장 낮은 점수: " + entry.getKey() + entry.getValue());

	}

}
