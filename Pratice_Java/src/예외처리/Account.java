package 예외처리;

public class Account {
	private long balance;

	public Account() {

	}

	public long getBalance() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) throws BalanceInsufficientException { // 어플리케이션 예외 던짐
		if (balance < money) {
			throw new BalanceInsufficientException("잔고부족:" + (money - balance) + "모자람");
		}
		balance -= money;
	}
}
