package 컬렉션프레임워크;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("룬아", 80);
		map.put("홍길동", 95);
		System.out.println("맵의 총 Entry 수: " + map.size());

		// 객체 찾기
		System.out.println("\t홍길동 : " + map.get("홍길동")); // 키에 따른 value 반환
		System.out.println();

		// 객체를 하나씩 처리
		Set<String> set = map.keySet(); // map의 keyset 얻기
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);

		}
		System.out.println();

		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry수 :" + map.size());

		// 객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entries = map.entrySet(); // Map.EntrySet 얻기 (k,v)
		Iterator<Map.Entry<String, Integer>> iterator2 = entries.iterator(); // 엔트리셋에 대한 이터레이터

		while (iterator2.hasNext()) {
			Map.Entry<String, Integer> entry = iterator2.next(); // 이터레이터를 통해 (K,V) 엔트리 객체 1개씩 가져옴
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println();
	}

}
