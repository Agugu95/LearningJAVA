package �÷��������ӿ�ũ;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("ȫ�浿", new Integer(87));
		treeMap.put("���μ�", new Integer(10));
		treeMap.put("�⸱��", new Integer(25));

		Map.Entry<String, Integer> entry = null;

		entry = treeMap.firstEntry();
		System.out.println("���� ���� ����: " + entry.getKey() + entry.getValue());

	}

}
