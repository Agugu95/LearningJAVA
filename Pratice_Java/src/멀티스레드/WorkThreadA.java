package 멀티스레드;

public class WorkThreadA extends Thread {
	private WorkObject workObject;

	public WorkThreadA(WorkObject workObject) {
		this.workObject = workObject; // 공유 객체를 파라미터로 받아 필드에 저장
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			workObject.methodA(); // 공유 객체의 동기화 메소드A 10번 루핑
		}
	}
}
