package ¶÷´Ù½Ä;

public class RunnableLamdaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = () -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
			}
		};
		// Thread thread = new Thread(runnable);
		Thread thread = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
	}

}
