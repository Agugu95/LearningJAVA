package ���׸�;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = Util.<Integer>boxing(100); // ����� Ÿ�� ����
		int intValue = box1.get();

		Box<String> box2 = Util.boxing("ȫ�浿"); // �Ķ���͸� ���� Ÿ�� ����
		String strValue = box2.get();
	}

}
