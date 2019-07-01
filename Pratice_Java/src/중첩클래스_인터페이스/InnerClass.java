package 중첩클래스_인터페이스;

public class InnerClass {
	public InnerClass() {
		// TODO Auto-generated constructor stub
		System.out.println("메인 클래스 객체 생성");
	}

	public class InstanceClass { // 인스턴스 클래스
		public InstanceClass() {
			// TODO Auto-generated constructor stub
			System.out.println("중첩 인스턴스 클래스 객체 생성");
		}

		int field1; // 필드

		void method() { // 메소드
			System.out.println("중첩 클래스의 메소드");
		}
	}

	public static class StaticClass {
		public StaticClass() {
			// TODO Auto-generated constructor stub
			System.out.println("중첩 스태틱 클래스 객체 생성");
		}

		int field1;
		static int field2;

		void method1() {
			System.out.println("중첩 스태틱 클래스의 인스턴스 메소드");
		}

		static void method2() {
			System.out.println("중첩 스태틱 클래스의 스태틱 메소드");
		}
	}

	public void method() {
		// 로컬 클래스
		class LocalClass {
			public LocalClass() {
				// TODO Auto-generated constructor stub
				System.out.println("메소드 내 로컬 클래스 객체 생성");
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
