package ��Ƽ������;

public class ThreadStateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StatePrintThread statePrintThread = new StatePrintThread(new PrintTargetThread());
		statePrintThread.start();
	}

}
