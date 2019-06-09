package 자동타입변환;

public class 자동변환_접근_오버라이딩 extends 자동변환_접근_메소드 {
	@Override
	public void method2() {
		System.out.println("오버라이딩 된 메소드 2번");
	}

	public void method3() {
		System.out.println("오버라이딩 안된 메소드 3번");
	}

}
