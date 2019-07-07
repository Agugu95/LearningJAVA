package 멀티스레드;

public class BeepThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable beepTask = new ThreadClass(); // Runnable 타입으로 생성한 작업 스레드 객체
		Thread thread = new Thread(beepTask); // 객체를 생성자에 대입한 진짜 생성되는 스레드
		thread.start(); // 객체 -> 생성자 -> start() 로 실행된 스레드
		// Beep 소리를 내는 작업 스레드(Runnable을 통한 멀티 스레드)

		for (int i = 0; i < 5; i++) { // 프린트작업 스레드(메인)
			System.out.println("Beep");
			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}

	}

}
