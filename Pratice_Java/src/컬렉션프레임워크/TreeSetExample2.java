package �÷��������ӿ�ũ;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeset = new TreeSet<>();
		treeset.add(new Integer(99));
		treeset.add(new Integer(90));
		treeset.add(new Integer(75));
		treeset.add(new Integer(83));
		treeset.add(new Integer(23));

		NavigableSet<Integer> desendingSet = treeset.descendingSet(); // �������� ���� ��ȯ
		for (Integer score : desendingSet) {
			System.out.println(score + " ");
		}
		System.out.println();

		NavigableSet<Integer> ascendingSet = treeset.descendingSet().descendingSet(); // �������� ���� 2�� = ��������
		for (Integer score : ascendingSet) {
			System.out.println(score + " ");
		}
	}

}
