package �ڵ�Ÿ�Ժ�ȯ_�ڵ���;

public class Tire {
	// FILED
	public int maxRotation; // �ִ� ȸ����(Ÿ�̾� ����)
	public int accmulatedRotation; // ���� ȸ�� ��
	public String location; // Ÿ�̾��� ��ġ

	// Constructor
	public Tire(String location, int maxRotation) {
		this.location = location; // �Ķ���͸� ���� �ʱ�ȭ
		this.maxRotation = maxRotation; // �Ķ���͸� ���� �ʱ�ȭ
	}

	// Method
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "�ִ� ȸ����: " + (maxRotation - accmulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("***" + location + " Ÿ�̾� ��ũ ***");
			return false;
		}
	}
}
