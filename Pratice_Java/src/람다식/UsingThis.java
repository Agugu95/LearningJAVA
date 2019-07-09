package ¶÷´Ù½Ä;

public class UsingThis {
	public int outterField = 10;

	class Inner {
		int innerFiled = 20;

		void method() {
			MyFunctionalInterface mi = () -> {
				System.out.println("Outter: " + outterField);
				System.out.println("Outter: " + UsingThis.this.outterField);
				System.out.println();
				System.out.println("Inner: " + innerFiled);
				System.out.println("Inner: " + this.innerFiled);
			};
			mi.method();
		}
	}

}
