package �ڵ�Ÿ�Ժ�ȯ;

public interface TestB extends TestA {
	void printB();

	@Override
	default void print() {
		// TODO Auto-generated method stub
		System.out.println("����� ����Ʈ �޼ҵ�");
	}
}
