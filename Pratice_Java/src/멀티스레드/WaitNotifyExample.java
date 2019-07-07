package 멀티스레드;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WorkObject sharedObject = new WorkObject(); // 공유 객체 생성
//
//		WorkThreadA workThreadA = new WorkThreadA(sharedObject);
//		WorkThreadB workThreadB = new WorkThreadB(sharedObject);
//
//		workThreadA.start();
//		workThreadB.start();

		DataBox dataBox = new DataBox();

		ProductThread productThread = new ProductThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);

		productThread.start();
		consumerThread.start();
	}

}
