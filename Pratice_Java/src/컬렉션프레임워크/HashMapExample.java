package �÷��������ӿ�ũ;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���", 80);
		map.put("ȫ�浿", 95);
		System.out.println("���� �� Entry ��: " + map.size());

		// ��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿")); // Ű�� ���� value ��ȯ
		System.out.println();

		// ��ü�� �ϳ��� ó��
		Set<String> set = map.keySet(); // map�� keyset ���
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);

		}
		System.out.println();

		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry�� :" + map.size());

		// ��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entries = map.entrySet(); // Map.EntrySet ��� (k,v)
		Iterator<Map.Entry<String, Integer>> iterator2 = entries.iterator(); // ��Ʈ���¿� ���� ���ͷ�����

		while (iterator2.hasNext()) {
			Map.Entry<String, Integer> entry = iterator2.next(); // ���ͷ����͸� ���� (K,V) ��Ʈ�� ��ü 1���� ������
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + " : " + value);
		}
		System.out.println();
	}

}
