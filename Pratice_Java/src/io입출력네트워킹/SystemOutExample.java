package io입출력네트워킹;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// 한글을 받아 오는 법
		// 바이트 배열 -> 바이트 읽어오기 -> 스트링 객체로 변환
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
		String hangule = "가나다라마바사아자차카타파하";
		bs = hangule.getBytes();
		os.write(bs);
		os.flush();
		os.close();
	}

}
