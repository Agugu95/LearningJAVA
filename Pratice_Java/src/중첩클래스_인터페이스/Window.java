package ��øŬ����_�������̽�;

import ��øŬ����_�������̽�.Button.OnClickListener;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();

	// �ʵ� �ʱ� �� ���� (�͸�ü�� ����)
	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("CALL ME ");
		}
	};

	Window() {
		btn1.setOnClickListener(listener); // �Ű������� �ʵ� new Button.onclicklistener ����
		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("GO AWAY");
			}
		});
	}
}
