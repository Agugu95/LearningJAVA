package io����³�Ʈ��ŷ;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// �ѱ��� �޾� ���� ��
		// ����Ʈ �迭 -> ����Ʈ �о���� -> ��Ʈ�� ��ü�� ��ȯ
		byte[] bs = new byte[100];
		OutputStream os = System.out;

		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}
		os.write(10);

		for (byte b = 97; b < 123; b++) {
			os.write(b);
		}
		os.write(10);
		String hangule = "�����ٶ󸶹ٻ������īŸ����";
		bs = hangule.getBytes();
		os.write(bs);
		os.flush();
		os.close();
	}

}
