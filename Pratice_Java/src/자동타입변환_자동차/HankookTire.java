package 자동타입변환_자동차;

public class HankookTire extends Tire {
	// Tire 를 상속받은 HankookTire 클래스

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // 부모 생성자의 객체가 생성이 먼저 되어야만, 자식 객체도 생성
		// TODO Auto-generated constructor stub
	}

	// Method
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "Hankook 타이어 최대 회전수: " + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*********" + location + "HankookTire 펑크");
			return false;
		}
	}

}
