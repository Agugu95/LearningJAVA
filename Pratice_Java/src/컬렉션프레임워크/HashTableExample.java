package �÷��������ӿ�ũ;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("ID�� ��й�ȣ�� �Է��ϼ���");
			System.out.print("ID : ");
			String Id = sc.nextLine();

			System.out.print("�н�����: ");
			String Pw = sc.nextLine();
			System.out.println();
			if (map.containsKey(Id)) {
				if (map.get(Id).equals(Pw)) {
					System.out.println("�α��� ����");
					break;
				} else {
					System.out.println("���̵� Ȥ�� ��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
			}
		}
	}
}
