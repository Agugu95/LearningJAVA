package 멀티스레드;

public class ThreadGroupExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup group = new ThreadGroup("myGroup");
		WorkThreadException workThreadExceptionA = new WorkThreadException(group, "wrokThreadA");
		WorkThreadException workThreadExceptionB = new WorkThreadException(group, "workThreadB");

		workThreadExceptionA.start();
		workThreadExceptionB.start();

		System.out.println("Main스레드 그룹의 list() 출력 내용");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		mainGroup.list();
		System.out.println();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		System.out.println("myGroup 스레드 그룹의 inerrupt() 호출");
		group.interrupt();
	}

}
