package 중첩클래스_인터페이스;

import 중첩클래스_인터페이스.Button.OnClickListener;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();

	// 필드 초기 값 대입 (익명객체로 선언)
	Button.OnClickListener listener = new Button.OnClickListener() {

		@Override
		public void onClick() {
			// TODO Auto-generated method stub
			System.out.println("CALL ME ");
		}
	};

	Window() {
		btn1.setOnClickListener(listener); // 매개값으로 필드 new Button.onclicklistener 대입
		btn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("GO AWAY");
			}
		});
	}
}
