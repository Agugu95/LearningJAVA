package �ڵ�Ÿ�Ժ�ȯ;

public class �ڵ���ȯ_����_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		�ڵ���ȯ_����_�������̵� child = new �ڵ���ȯ_����_�������̵�();

		�ڵ���ȯ_����_�޼ҵ� parent = child;
		parent.method1();
		parent.method2(); // �θ�Ÿ������ ��ȯ ������, �������̵� �� �޼ҵ� ȣ��
		// parent.method3(); ���� ���� ���� �޼ҵ�, �ڽ� Ŭ������ ������ �θ� Ÿ������ ��ȯ �Ʊ⿡ ���� �Ұ�
	}

}
