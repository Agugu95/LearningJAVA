package ��øŬ����_�������̽�;

public class InnerClass {
	public InnerClass() {
		// TODO Auto-generated constructor stub
		System.out.println("���� Ŭ���� ��ü ����");
	}

	public class InstanceClass { // �ν��Ͻ� Ŭ����
		public InstanceClass() {
			// TODO Auto-generated constructor stub
			System.out.println("��ø �ν��Ͻ� Ŭ���� ��ü ����");
		}

		int field1; // �ʵ�

		void method() { // �޼ҵ�
			System.out.println("��ø Ŭ������ �޼ҵ�");
		}
	}

	public static class StaticClass {
		public StaticClass() {
			// TODO Auto-generated constructor stub
			System.out.println("��ø ����ƽ Ŭ���� ��ü ����");
		}

		int field1;
		static int field2;

		void method1() {
			System.out.println("��ø ����ƽ Ŭ������ �ν��Ͻ� �޼ҵ�");
		}

		static void method2() {
			System.out.println("��ø ����ƽ Ŭ������ ����ƽ �޼ҵ�");
		}
	}

	public void method() {
		// ���� Ŭ����
		class LocalClass {
			public LocalClass() {
				// TODO Auto-generated constructor stub
				System.out.println("�޼ҵ� �� ���� Ŭ���� ��ü ����");
			}

			@SuppressWarnings("unused")
			int field1;

			void method1() {

			}
		}
		LocalClass local = new LocalClass();
		local.field1 = 3;
		local.method1();
	}
}
