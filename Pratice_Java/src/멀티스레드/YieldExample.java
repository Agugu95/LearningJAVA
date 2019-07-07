package 멀티스레드;

public class YieldExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YeildThreadA yeildThreadA = new YeildThreadA();
		YeildThreadB yeildThreadB = new YeildThreadB();

		yeildThreadA.start();
		yeildThreadB.start(); // Thread A B 모두 실행

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		yeildThreadA.work = false; // work가 false면 yeild B만 실행

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		yeildThreadA.work = true; // true면 번갈아 실행

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		yeildThreadA.stop = true;
		yeildThreadB.stop = true; // 둘 다 종료
	}

}
