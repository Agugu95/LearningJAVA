package �ڵ�Ÿ�Ժ�ȯ;

public class TestC implements TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pirntA() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printB() {
		// TODO Auto-generated method stub

	}

	TestA a = new TestA() { // Ŭ������ ������ �����δ� �͸�����ü�� ���� �����

		@Override
		public void pirntA() {
			// TODO Auto-generated method stub

		}
	};

	TestB b = new TestC();

}
