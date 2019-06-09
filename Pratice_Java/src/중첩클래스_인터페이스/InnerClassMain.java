package 중첩클래스_인터페이스;

public class InnerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass inner = new InnerClass();

		// 인스턴스 멤버 클래스 객체 생성
		// 중첩 클래스의 사용은 클래스명.중첩클래스명 중첩클래스 변수 = 클래스변수.new 중첩클래스명();
		InnerClass.InstanceClass instance = inner.new InstanceClass();
		instance.field1 = 3;
		instance.method();

		// 정적 멤버 클래스 객체 생성
		// 정적 멤버 클래스의 사용은 클래스명.중첩클래스명 중첩클래스 변수 = new 클래스명.중첩클래스명();
		InnerClass.StaticClass staticclass = new InnerClass.StaticClass();
		staticclass.field1 = 3;
		staticclass.method1();
		InnerClass.StaticClass.field2 = 3; // 정적 필드
		InnerClass.StaticClass.method2(); // 정적 메소드

		// 로컬 멤버 클래스 객체 생성을 위한 메소드 호출
		inner.method();

	}

}
