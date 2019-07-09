package ���׸�;

public class Pair<K, V> { // K,V�� ���� ���׸� Ŭ����
	private K key; // K Ÿ�� �ʵ�
	private V value; // V Ÿ�� �ʵ�

	public Pair(K key, V value) { // �ΰ��� �޴� pair ������
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
