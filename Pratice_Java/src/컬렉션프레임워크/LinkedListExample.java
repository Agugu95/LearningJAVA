package �÷��������ӿ�ũ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();

		long startTime; // ���� �ð�
		long endTime; // ���� �ð�

		startTime = System.nanoTime(); // �ý��� �ð��� ���� �ð����� ����
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));

		}
		System.out.println(list1);
		endTime = System.nanoTime(); // ���� �ð��� �޼ҵ常ŭ �ð��� �帥 �ý��� �ð����� �ٽ� ����
		System.out.println("�ɸ� �ð�: " + (endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));

		}
		System.out.println(list2);
		endTime = System.nanoTime();
		System.out.println("�ɸ� �ð�: " + (endTime - startTime) + "ns");
	}

}
