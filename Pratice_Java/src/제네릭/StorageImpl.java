package 제네릭;

public class StorageImpl<T> implements Storage<T> {
	private T[] array; // 제네릭 T 타입 배열 필드

	public StorageImpl(int capacity) {
		// TODO Auto-generated constructor stub
		this.array = (T[]) (new Object[capacity]); // (T[]) (new Object[n])
	}

	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub
		array[index] = item;

	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return array[index];
	}

}
