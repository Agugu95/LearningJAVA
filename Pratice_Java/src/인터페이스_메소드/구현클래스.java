package �������̽�_�޼ҵ�;

public class ����Ŭ���� implements �߻�޼ҵ� {
	@SuppressWarnings("unused")
	private int volume;

	@Override // ������̼��� ����Ͽ� �������̵� ������ ���
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �մϴ�");

	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� ���ϴ�");
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
		System.out.println("���� TV ����: " + volume);
	}

}
