package ��øŬ����_�������̽�;

public class ����Outter {
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
			System.out.println(����Outter.this.field);
			����Outter.this.method();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		����Outter outter = new ����Outter();
		����Outter.Nasted nested = outter.new Nasted();
		nested.print();
	}

}
