package ��Ƽ������;

public class ThreadGroupExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup group = new ThreadGroup("myGroup");
		WorkThreadException workThreadExceptionA = new WorkThreadException(group, "wrokThreadA");
		WorkThreadException workThreadExceptionB = new WorkThreadException(group, "workThreadB");

		workThreadExceptionA.start();
		workThreadExceptionB.start();

		System.out.println("Main������ �׷��� list() ��� ����");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("myGroup ������ �׷��� inerrupt() ȣ��");
		group.interrupt();
	}

}
