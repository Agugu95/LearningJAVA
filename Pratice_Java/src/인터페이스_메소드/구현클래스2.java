package 인터페이스_메소드;

public class 구현클래스2 implements 추상메소드 {
	@SuppressWarnings("unused")
	private int volume;
	@SuppressWarnings("unused")
	private boolean mute;

	@Override // 어노테이션을 사용하여 오버라이드 됐음을 명시
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > 추상메소드.MAX_VOLUME) {
			this.volume = 추상메소드.MAX_VOLUME;
		} else if (volume < 추상메소드.MIN_VOLUME) {
			this.volume = 추상메소드.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + volume);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if (mute) {
			System.out.println("Audio 박살남");
		} else {
			System.out.println("Audio 박살 안남");
		}
	}
}