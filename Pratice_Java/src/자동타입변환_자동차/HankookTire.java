package �ڵ�Ÿ�Ժ�ȯ_�ڵ���;

public class HankookTire extends Tire {
	// Tire �� ��ӹ��� HankookTire Ŭ����

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation); // �θ� �������� ��ü�� ������ ���� �Ǿ�߸�, �ڽ� ��ü�� ����
		// TODO Auto-generated constructor stub
	}

	// Method
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "Hankook Ÿ�̾� �ִ� ȸ����: " + (maxRotation - accmulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*********" + location + "HankookTire ��ũ");
			return false;
		}
	}

}
