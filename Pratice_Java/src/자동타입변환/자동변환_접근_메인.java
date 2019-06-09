package 자동타입변환;

public class 자동변환_접근_메인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		자동변환_접근_오버라이딩 child = new 자동변환_접근_오버라이딩();

		자동변환_접근_메소드 parent = child;
		parent.method1();
		parent.method2(); // 부모타입으로 변환 됐지만, 오버라이딩 된 메소드 호출
		// parent.method3(); 정의 되지 않은 메소드, 자식 클래스에 있지만 부모 타입으로 변환 됐기에 접근 불가
	}

}
