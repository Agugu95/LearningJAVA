package ��Ƽ������;

public class WaitNotifyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		WorkObject sharedObject = new WorkObject(); // ���� ��ü ����
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
