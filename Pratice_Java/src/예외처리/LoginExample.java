package 예외처리;

import java.util.Scanner;

public class LoginExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String pw = sc.nextLine();
		try {
			login(id, pw);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println();
		}
	}

	public static void login(String id, String pw) throws Exception {
		// id가 "blue"가 아니라면 예외 던짐
		String dataId = "blue";
		String dataPw = "1q2w3e4r";

		// pw가 "1q2w3e4r"이 아니라면 예외 던짐
		if (!id.equals(dataId) || !pw.equals(dataPw)) {
			throw new WrongPasswordException("ID가 없거나 패스워드가 틀립니다..");
		} else {
			System.out.println("반갑습니다 " + id + "님");
		}
	}
}
