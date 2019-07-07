package 멀티스레드;

public class DataBox {
	private String data;

	public synchronized String getData() { // 동기화 메소드 data가 null이면 consumer스레드를 일시정지
		if (this.data == null) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		String returnValue = data;
		System.out.println("ConsumerThread가 읽은 데이터: " + returnValue);
		data = null; // data를 null로 만들고 product 스레드를 실행 대기 상태
		notify();
		return returnValue;
	}

	public synchronized void setData(String data) {
		if (this.data != null) {
			try {
				wait();
			} catch (InterruptedException e) {

			}
		}
		this.data = data;
		System.out.println("Product Thread가 생성한 데이터: " + data);
		notify();
	}
}
