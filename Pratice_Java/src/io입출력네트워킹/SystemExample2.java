package io����³�Ʈ��ŷ;

import java.io.IOException;
import java.io.InputStream;

public class SystemExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = System.in;

		byte[] bs = new byte[100]; // �о�� ����Ʈ �迭 (�˳��ϰ� 100)

		System.out.print("�̸�: "); // ��
		int nameBS = is.read(bs); // �о�� ����Ʈ ���� ���� = 4
		// -80, -83, 13, 10, 0 0 0 0..
		String name = new String(bs, 0, nameBS - 2);
		System.out.print("�ϰ���� ��: "); // �����ϴ� = 10
		int comment = is.read(bs); // -66, -8, -67, -64, -76, -49, -76, -39, 13, 10
		String com = new String(bs, 0, comment - 2);
		System.out.println("�Է��� �̸�: " + name);
		System.out.println("�Է��� �ϰ���� ��: " + com);

	}

}
