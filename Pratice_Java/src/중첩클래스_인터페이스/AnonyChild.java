package 중첩클래스_인터페이스;

public class AnonyChild {
	Parents field = new Parents() {

		void work() {
			System.out.println("출근");
		}

		@Override
		void wake() {
			System.out.println("스스로 일어남");
			work();
		}
	};

	void method1() {
		Parents localVar = new Parents() {
			void walk() {
				System.out.println("산책");
			}

			@Override
			void wake() {
				System.out.println("부모가 깨웁니다");
				walk();
			}
		};

		localVar.wake();
	}

	void method2(Parents parents) {
		parents.wake();
	}
}
