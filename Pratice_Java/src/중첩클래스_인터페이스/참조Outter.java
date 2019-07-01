package 중첩클래스_인터페이스;

public class 참조Outter {
	String field = "Outter-filed";

	void method() {
		System.out.println("Outter-method");
	}

	class Nasted {
		String field = "Nested-field";

		void method() {
			System.out.println("Nested-method");
		}

		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(참조Outter.this.field);
			참조Outter.this.method();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		참조Outter outter = new 참조Outter();
		참조Outter.Nasted nested = outter.new Nasted();
		nested.print();
	}

}
