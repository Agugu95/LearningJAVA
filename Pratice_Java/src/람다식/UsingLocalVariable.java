package ���ٽ�;

public class UsingLocalVariable {
	void method(int arg) { // ������ final Ư��
		int localVar = 40; // ������ final Ư��

//		arg = 30;
//		localVar = 41;

		// ���ٽ�
		MyFunctionalInterface mi = () -> {
			System.out.println("arg: " + arg); // �͸� ��ü������ ���� �������� final�� ��޵�
			System.out.println("localVar: " + localVar);
		};
		mi.method();
	}
}
