package 자동타입변환_자동차;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "Kumho 타이어 최대 회전수: " + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*********" + location + "KumhokTire 펑크");
			return false;
		}
	}

}
