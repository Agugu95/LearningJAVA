package �ڵ�Ÿ�Ժ�ȯ_�ڵ���;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) {
			System.out.println(location + "Kumho Ÿ�̾� �ִ� ȸ����: " + (maxRotation - accmulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("*********" + location + "KumhokTire ��ũ");
			return false;
		}
	}

}
