package ���׸�;

public class CompareUtil { // ���� ���׸� �޼ҵ� ���� Ŭ����
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey()); // Pair ��ü p1�� p2�� ���ٸ� true
		boolean valueCompare = p1.getValue().equals(p2.getValue()); // Pair ��ü p1�� p2�� ���ٸ� true
		return keyCompare && valueCompare; // bool�� ��� ����

	}
}
