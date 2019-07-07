package 멀티스레드;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumThread = new SumThread();
		sumThread.start();

		try {
			sumThread.join(); // sumThread 종료 전까지 메인 스레드 일시정지
		} catch (InterruptedException e) {

		} // 만약 join이 없다면 값은 0 이 나옴
			// 계산 완료 전에 main thread의 출력문이 실행 되기 때문
		System.out.println("1 ~ 100까지의 합: " + sumThread.getSum());
	}

}
