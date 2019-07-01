package 중첩클래스_인터페이스;

public class AnonyChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonyChild anony = new AnonyChild();

		// 익명 객체 필드 사용
		anony.field.wake();

		// 익명 객체 로컬 변수 사용
		anony.method1();

		// 익명 객체 매개값 사용
		anony.method2(new Parents() {
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				System.out.println("8시 기상");
				study();
			}
		});
	}

}
