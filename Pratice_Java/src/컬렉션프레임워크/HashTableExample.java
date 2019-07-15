package 컬렉션프레임워크;

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
			System.out.println("ID와 비밀버호를 입력하세요");
			System.out.print("ID : ");
			String Id = sc.nextLine();

			System.out.print("패스워드: ");
			String Pw = sc.nextLine();
			System.out.println();
			if (map.containsKey(Id)) {
				if (map.get(Id).equals(Pw)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("아이디 혹은 비밀번호가 일치하지 않습니다");
				}
			}
		}
	}
}
