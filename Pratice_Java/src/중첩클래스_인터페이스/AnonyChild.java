package ��øŬ����_�������̽�;

public class AnonyChild {
	Parents field = new Parents() {

		void work() {
			System.out.println("���");
		}

		@Override
		void wake() {
			System.out.println("������ �Ͼ");
			work();
		}
	};

	void method1() {
		Parents localVar = new Parents() {
			void walk() {
				System.out.println("��å");
			}

			@Override
			void wake() {
				System.out.println("�θ� ����ϴ�");
				walk();
			}
		};

		localVar.wake();
	}

	void method2(Parents parents) {
		parents.wake();
	}
}
