package api������;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Key ��ü�� �ĺ�Ű�� ��뤾�� String ���� �����ϴ� HashMape ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		// �ĺ�Ű "new Key(1)"�� ����
		hashMap.put(new Key(1), "pussyCat"); // �ʵ�� ������ �ٸ� ��ü

		// �ĺ�Ű "new Key(1)"�� ȫ�浿 �о��
		String value = hashMap.get(new Key(1)); // �ʵ�� ������ �ٸ� ��ü
		System.out.println(value); // hashcode �������̵� ���� �� null
		// hashcode �������̵� �� �ٸ� ��ü���� ���� ���� ������ ���� ���� ������ �ν�
		// equals == true && hashcode == true
	}

}
