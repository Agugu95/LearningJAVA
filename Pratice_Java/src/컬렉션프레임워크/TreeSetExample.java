package �÷��������ӿ�ũ;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(new Integer(99));
		treeset.add(new Integer(90));
		treeset.add(new Integer(75));
		treeset.add(new Integer(83));
		treeset.add(new Integer(23));

		Integer score = null;
		score = treeset.first();
		System.out.println("���� ���� ����: " + score);
		score = treeset.last();
		System.out.println("���� ���� ����: " + score);
		score = treeset.lower(new Integer(85));
		System.out.println("85���� ���� ����: " + score);
		score = treeset.higher(new Integer(49));
		System.out.println("49���� ���� ����: " + score);
		while (!treeset.isEmpty()) {
			score = treeset.pollFirst();
			System.out.println(score + "���� ��ü ��" + treeset.size());

		}
	}

}
