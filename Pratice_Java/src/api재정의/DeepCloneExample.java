package api������;

public class DeepCloneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� ��ü ����
		DeepClone original = new DeepClone("rwh", 25, new int[] { 90, 90 }, new Car("�ҳ�Ÿ"));

		// ���� ��ü ����
		DeepClone cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "�׷���";

		System.out.println();
	}

}
