package 멀티스레드;

public class WorkObject { // ThreadA와 ThreadB의 작업을 동기화 메소드로 작성한 공유 객체
	public synchronized void methodA() { // 동기화 메소드A
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {

		}
	}

	public synchronized void methodB() { // 동기화 메소드B
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {

		}
	}
}
