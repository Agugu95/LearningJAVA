package 예외처리;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();

		// 예금하기
		account.deposit(50000);
		System.out.println("예금액: " + account.getBalance());

		// 출금하기
		try {
			account.withdraw(1000000);
		} catch (BalanceInsufficientException e) { // 예외 받음
			// TODO: handle exception
			String msg = e.getMessage();
			System.out.println(msg);
			System.out.println();
			e.printStackTrace();
		}
	}

}
