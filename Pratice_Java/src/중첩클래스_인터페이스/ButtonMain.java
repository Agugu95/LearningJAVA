package ��øŬ����_�������̽�;

public class ButtonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button(); // ��ø �������̽�
		btn.setOnClickListener(new CallListener());
		btn.touch();
		btn.setOnClickListener(new MssageListener());
		btn.touch();

		Window window = new Window(); // �͸� ���� ��ü�� ����
		window.btn1.touch();
		window.btn2.touch();
	}

}
