package api������;

public class SallowCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ��ü ����
		SallowClone sa = new SallowClone("galaxy", "samsung", "12345", 25, true);

		// ���� ��ü�� ���� �� �н����� ����
		SallowClone cloned = sa.getMember();
		cloned.pw = "1q2w3e4r";

		System.out.println("���� ��ü�� �ʵ� ��");
		System.out.println(cloned.adult);
		System.out.println(cloned.pw);

		System.out.println();

		System.out.println("���� ��ü�� �ʵ� ��");
		System.out.println(sa.adult);
		System.out.println(sa.pw);
	}

}
