package 중첩클래스_인터페이스;

public class ButtonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button(); // 중첩 인터페이스
		btn.setOnClickListener(new CallListener());
		btn.touch();
		btn.setOnClickListener(new MssageListener());
		btn.touch();

		Window window = new Window(); // 익명 구현 객체를 통한
		window.btn1.touch();
		window.btn2.touch();
	}

}
