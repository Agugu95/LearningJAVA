package ����ó��;

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
		// id�� "blue"�� �ƴ϶�� ���� ����
		String dataId = "blue";
		String dataPw = "1q2w3e4r";

		// pw�� "1q2w3e4r"�� �ƴ϶�� ���� ����
		if (!id.equals(dataId) || !pw.equals(dataPw)) {
			throw new WrongPasswordException("ID�� ���ų� �н����尡 Ʋ���ϴ�..");
		} else {
			System.out.println("�ݰ����ϴ� " + id + "��");
		}
	}
}
