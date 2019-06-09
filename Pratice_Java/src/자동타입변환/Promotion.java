package 자동타입변환;

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

		// 부모 클래스 A를 제외한 각 클래스 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		// A를 상속받은 B,C,D,E 클래스는 A 클래스 타입으로 Promotion(자동 타입 변환)
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		// B를 상속받은 D,E 클래스는 B 클래스 타입으로 Promotion 가능
		B b1 = d;
		C c1 = e;

		// B b3 = e;
		// C c2 = d; CAN NOT CONVERT B와 C 클래스는 E와 D클래스를 상속하지 않음

	}

}
