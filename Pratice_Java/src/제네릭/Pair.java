package 제네릭;

public class Pair<K, V> { // K,V를 가진 제네릭 클래스
	private K key; // K 타입 필드
	private V value; // V 타입 필드

	public Pair(K key, V value) { // 두개를 받는 pair 생성자
		this.key = key;
		this.value = value;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

}
