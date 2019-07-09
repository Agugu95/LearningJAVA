package 제네릭;

public class CompareUtil { // 정적 제네릭 메소드 정의 클래스
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey()); // Pair 객체 p1과 p2가 같다면 true
		boolean valueCompare = p1.getValue().equals(p2.getValue()); // Pair 객체 p1과 p2가 같다면 true
		return keyCompare && valueCompare; // bool값 모두 리턴

	}
}
