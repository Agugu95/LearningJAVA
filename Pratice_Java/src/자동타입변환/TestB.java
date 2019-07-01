package 자동타입변환;

public interface TestB extends TestA {
	void printB();

	@Override
	default void print() {
		// TODO Auto-generated method stub
		System.out.println("변경된 디폴트 메소드");
	}
}
