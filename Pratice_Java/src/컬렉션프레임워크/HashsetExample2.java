package �÷��������ӿ�ũ;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<>();

		set.add(new Member("ȫ�浿", 30)); // ���� ���� �ٸ� �ν��Ͻ�
		set.add(new Member("ȫ�浿", 30)); // ���� ���� �ٸ� �ν��Ͻ�
		String string = new String();

		System.out.println(set.size()); // �ٸ� �ν��Ͻ����� �������̵��� equals�� ���� �ߺ� ���� ����
	}

}
