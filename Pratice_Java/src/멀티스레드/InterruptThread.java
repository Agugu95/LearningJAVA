package 멀티스레드;

public class InterruptThread extends Thread {
	@Override
	public void run() {
//		try {
//			while (true) {
//				System.out.println("실행 중");
//				Thread.sleep(1);
//
//			}
//		} catch (InterruptedException e) { // InterruptedException은 스레드가 반드시 일시정지 되었을 때만 발생
//
//		}

		while (true) {
			System.out.println("실행 중");
			if (isInterrupted() == true) { // interrupt 메소드가 호출되면 true반환
				break;
			}
		}
		System.out.println("자원 정리");
		System.out.println("실행 종료");
	}
}
