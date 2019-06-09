package 인터페이스_메소드;

public interface 추상메소드 {
	// public static final filed (상수)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// abstract method
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	// default method
	// default 메소드는 인터페이스에 이미 선언되어진 메소드
	// 인터페이스 변경 시에도 각 클래스들은 새로 오버라이딩 할 필요가 없음
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리 되었습니다.");
		} else {
			System.out.println("무음 해제 되었습니다.");
		}
	}

	// static method
	// 간단한 기능의 구현을 위한 유틸리티성 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환 합니다.");
	}

}
