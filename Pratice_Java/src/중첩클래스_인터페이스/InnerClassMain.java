package ��øŬ����_�������̽�;

public class InnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass inner = new InnerClass();

		// �ν��Ͻ� ��� Ŭ���� ��ü ����
		// ��ø Ŭ������ ����� Ŭ������.��øŬ������ ��øŬ���� ���� = Ŭ��������.new ��øŬ������();
		InnerClass.InstanceClass instance = inner.new InstanceClass();
		instance.field1 = 3;
		instance.method();

		// ���� ��� Ŭ���� ��ü ����
		// ���� ��� Ŭ������ ����� Ŭ������.��øŬ������ ��øŬ���� ���� = new Ŭ������.��øŬ������();
		InnerClass.StaticClass staticclass = new InnerClass.StaticClass();
		staticclass.field1 = 3;
		staticclass.method1();
		InnerClass.StaticClass.field2 = 3; // ���� �ʵ�
		InnerClass.StaticClass.method2(); // ���� �޼ҵ�

		// ���� ��� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		inner.method();

	}

}
