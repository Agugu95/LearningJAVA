package �������̽�_�޼ҵ�;

public class ����Ŭ����2 implements �߻�޼ҵ� {
	@SuppressWarnings("unused")
	private int volume;
	@SuppressWarnings("unused")
	private boolean mute;

	@Override // ������̼��� ����Ͽ� �������̵� ������ ���
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� �մϴ�");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio�� ���ϴ�");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > �߻�޼ҵ�.MAX_VOLUME) {
			this.volume = �߻�޼ҵ�.MAX_VOLUME;
		} else if (volume < �߻�޼ҵ�.MIN_VOLUME) {
			this.volume = �߻�޼ҵ�.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� Audio ����: " + volume);
	}

	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if (mute) {
			System.out.println("Audio �ڻ쳲");
		} else {
			System.out.println("Audio �ڻ� �ȳ�");
		}
	}
}