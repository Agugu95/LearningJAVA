package 자동타입변환;

public interface TestA {
	void pirntA();

	default void print() {
		System.out.println("디폴트메소드 ");
	}
}
