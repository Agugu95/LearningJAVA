package �ڵ�Ÿ�Ժ�ȯ;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class Promotion {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �θ� Ŭ���� A�� ������ �� Ŭ���� ��ü ����
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		// A�� ��ӹ��� B,C,D,E Ŭ������ A Ŭ���� Ÿ������ Promotion(�ڵ� Ÿ�� ��ȯ)
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		// B�� ��ӹ��� D,E Ŭ������ B Ŭ���� Ÿ������ Promotion ����
		B b1 = d;
		C c1 = e;

		// B b3 = e;
		// C c2 = d; CAN NOT CONVERT B�� C Ŭ������ E�� DŬ������ ������� ����

	}

}
