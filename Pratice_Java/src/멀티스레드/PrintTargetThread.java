package 멀티스레드;

public class PrintTargetThread extends Thread {
	@Override
	public void run() {
		for (long i = 0; i < 1000000000; i++) { // 10억번 루프로 실행 대기 상태

		}

		try {
			Thread.sleep(1500); // 스레드 슬립으로 1.5초간 TIME_WATING
		} catch (Exception e) {

		}

		for (long i = 0; i < 1000000000; i++) { // 10억번 루프로 실행 대기

		}

	}
}
