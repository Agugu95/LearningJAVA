package 멀티스레드;

import java.awt.Toolkit;

public class SleepExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i < 10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000); // 3초 간 잠듬, 시간이 만료 전 예외 발생 시 InterruptedException 발생
			} catch (InterruptedException e) { // InterruptedException e 예외처리

			}
		}
	}

}
