package 중첩클래스_인터페이스;

public class Anonymous {
	// 익명 구현 객체는 인터페이스 자체를 바로 구현과 동시에 오버라이딩
	Vehicle field = new Vehicle() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("자전거가 달립니다.");

		}
	};

	void method1() {
		Vehicle localVar = new Vehicle() { // 메소드의 실행이 끝나도 사용하기 위한 로컬변수 객체생성

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("승용차가 달립니다.");
			}
		};
		localVar.run();
	}

	void method2(Vehicle v) {
		v.run();
	}
}
