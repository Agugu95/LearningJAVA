package 문제;

public class Acc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다");
			}
		};
		action.work();
	}
}
