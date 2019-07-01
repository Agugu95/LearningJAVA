package 중첩클래스_인터페이스;

public class Outer {
	public void method1(final int arg) {
		final int localVariale = 1;
		class Inner1 {
			public void method() {
				int result = arg - localVariale;
				System.out.println(result);
			}
		}
		Inner1 inner1 = new Inner1();
		inner1.method();
	}

	public void method(int arg) {
		int localVariavle = 1;
		class Inner2 {
			public void method() {
				int result = arg + localVariavle;
				System.out.println(result);
			}
		}
		Inner2 inner2 = new Inner2();
		inner2.method();
	}

	public static void main(String args[]) {
		Outer outer = new Outer();
		outer.method1(100);
		outer.method(100);

	}
}