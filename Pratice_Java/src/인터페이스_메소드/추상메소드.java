package �������̽�_�޼ҵ�;

public interface �߻�޼ҵ� {
	// public static final filed (���)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// abstract method
	public void turnOn();

	public void turnOff();

	public void setVolume(int volume);

	// default method
	// default �޼ҵ�� �������̽��� �̹� ����Ǿ��� �޼ҵ�
	// �������̽� ���� �ÿ��� �� Ŭ�������� ���� �������̵� �� �ʿ䰡 ����
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("���� ó�� �Ǿ����ϴ�.");
		} else {
			System.out.println("���� ���� �Ǿ����ϴ�.");
		}
	}

	// static method
	// ������ ����� ������ ���� ��ƿ��Ƽ�� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ �մϴ�.");
	}

}
