package 멀티스레드;

public class Calculator {
	private int memory;

	public int getMemory() { // getter 함수
		return memory;
	}

//	public void setMemory(int memory) { // setter 함수 계산기 메모리에 값을 저장
//		this.memory = memory; // 파라미터를 필드에 저장
//		try {
//			Thread.sleep(200);
//		} catch (InterruptedException e) {
//			// TODO: handle exception
//		}
//		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
//	}

	public synchronized void setMemory(int memory) { // syncronized 키워드를 사용한 동기화 메소드
		// syncronized(this) { 동기화 블록
		this.memory = memory;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
