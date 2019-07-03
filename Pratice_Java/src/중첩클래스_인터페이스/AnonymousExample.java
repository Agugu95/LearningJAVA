package 중첩클래스_인터페이스;

public class AnonymousExample {
	public static void main(String args[]) {
		Anonymous anonymous = new Anonymous();
		anonymous.field.run();
		anonymous.method1();
		anonymous.method2(new Vehicle() { // 인터페이스 익명 구현 객체

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("트럭이 달립니다.");
			}

		});
	}
}
