package ���׸�;

public interface Storage<T> { // ���׸� �������̽�
	// ���׸� �������̽��� ���� �ʵ� ���� X ���� Ŭ������ ����
	public void add(T item, int index);

	public T get(int index);
}
