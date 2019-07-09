package 제네릭;

public interface Storage<T> { // 제네릭 인터페이스
	// 제네릭 인터페이스는 내부 필드 존재 X 구현 클래스에 있음
	public void add(T item, int index);

	public T get(int index);
}
