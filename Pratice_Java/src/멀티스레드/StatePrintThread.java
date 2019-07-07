package 멀티스레드;

public class StatePrintThread extends Thread {
	private Thread PrintTargetThread; // 스레드 타입 필드

	public StatePrintThread(Thread thread) { // 생성자
		this.PrintTargetThread = thread; // 필드에 타겟 스레드 정보 저장
	}

	@Override
	public void run() {
		while (true) {
			Thread.State state = PrintTargetThread.getState(); // 스레드 상태 얻기
			System.out.println("타겟 스레드 상태: " + state);

			if (state == Thread.State.NEW) { // 스레드의 상태가 NEW (실행대기)라면 실행
				PrintTargetThread.start();
			}

			if (state == Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	}
}
