package ��øŬ����_�������̽�;

public class Button {
	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	interface OnClickListener { // Button Ŭ���� ���� ��ø �������̽�
		void onClick();
	}

}