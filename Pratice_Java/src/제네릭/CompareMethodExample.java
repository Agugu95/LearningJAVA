package ���׸�;

public class CompareMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer, String> p1 = new Pair<>(1, "���"); // ��Ƽ ���׸� �Ķ���� ���� <>
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "���"); // ��Ƽ ���׸� �Ķ���� ���
		boolean result1 = CompareUtil.<Integer, String>compare(p1, p2); // ���׸� Ÿ�� ���
		if (result1) {
			System.out.println("���� ���� ��ü");
		} else {
			System.out.println("�������� �������� ����");
		}

		Pair<String, String> p3 = new Pair<>("���", "�ٳ���");
		Pair<String, String> p4 = new Pair<String, String>("���", "������");
		boolean result2 = CompareUtil.compare(p3, p4);
		if (result2) {
			System.out.println("���� ���� ��ü");
		} else {
			System.out.println("�������� ����");
		}
	}

}
