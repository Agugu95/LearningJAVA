package ��øŬ����_�������̽�;

public class AnonyChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonyChild anony = new AnonyChild();

		// �͸� ��ü �ʵ� ���
		anony.field.wake();

		// �͸� ��ü ���� ���� ���
		anony.method1();

		// �͸� ��ü �Ű��� ���
		anony.method2(new Parents() {
			void study() {
				System.out.println("�����մϴ�.");
			}

			@Override
			void wake() {
				System.out.println("8�� ���");
				study();
			}
		});
	}

}
