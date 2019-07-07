package 멀티스레드;

public class User1 extends Thread {
	private Calculator calculator;

	public void setCalculator(Calculator calculator) { // 스레드 이름을 user1ㄹ 설정
		this.setName("User1");
		this.calculator = calculator; // 공유 객체를 필드에 저장
	}

	@Override
	public void run() {
		calculator.setMemory(100); // 공유 객체 메모리에 100을 저장
	}
}
