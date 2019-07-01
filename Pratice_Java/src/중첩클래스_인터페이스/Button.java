package 중첩클래스_인터페이스;

public class Button {
	OnClickListener listener;

	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	void touch() {
		listener.onClick();
	}

	interface OnClickListener { // Button 클래스 내부 중첩 인터페이스
		void onClick();
	}

}