package ����ó��;

public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();

		// �����ϱ�
		account.deposit(50000);
		System.out.println("���ݾ�: " + account.getBalance());

		// ����ϱ�
		try {
			account.withdraw(1000000);
		} catch (BalanceInsufficientException e) { // ���� ����
			// TODO: handle exception
			String msg = e.getMessage();
			System.out.println(msg);
			System.out.println();
			e.printStackTrace();
		}
	}

}
