package 자동타입변환;

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

	TestA a = new TestA() { // 클래스가 없지만 실제로는 익명구현객체를 통해 선언됨

		@Override
		public void pirntA() {
			// TODO Auto-generated method stub

		}
	};

	TestB b = new TestC();

}
