package 멀티스레드;

public class ThreadNameExample {
	public static void main(String args[]) {
		Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드의 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName()); // main

		ThreadA a = new ThreadA(); // ThreadA 생성
		System.out.println("작업 스레드 이름: " + a.getName()); // ThreadA로 설정한 스레드
		a.start();

		ThreadB b = new ThreadB(); // ThreadB 생성
		System.out.println("작업 스레드 이름: " + b.getName()); // 자동 번호설정 Thread-1
		b.start();
	}
}
