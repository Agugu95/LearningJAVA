package ����ó��;

public class RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = new String();
		String data2 = new String();
		try {
			data1 = args[0];
			data2 = args[1];
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���� �Ű��� ����");
			System.out.println(e);
			return;
		}

		try {
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("��ȯ�Ұ�");
		} finally {
			System.out.println("�ٽ� �����ϼ���");
		}
	}

}
