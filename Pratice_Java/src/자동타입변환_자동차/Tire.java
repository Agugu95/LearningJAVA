package 자동타입변환_자동차;

public class Tire {
	// FILED
	public int maxRotation; // 최대 회전수(타이어 수명)
	public int accmulatedRotation; // 누적 회전 수
	public String location; // 타이어의 위치

	// Constructor
	public Tire(String location, int maxRotation) {
		this.location = location; // 파라미터를 통한 초기화
		this.maxRotation = maxRotation; // 파라미터를 통한 초기화
	}

	// Method
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "최대 회전수: " + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + " 타이어 펑크 ***");
			return false;
		}
	}
}
