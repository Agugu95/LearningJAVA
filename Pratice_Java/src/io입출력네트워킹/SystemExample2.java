package io입출력네트워킹;

import java.io.IOException;
import java.io.InputStream;

public class SystemExample2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStream is = System.in;

		byte[] bs = new byte[100]; // 읽어올 바이트 배열 (넉넉하게 100)

		System.out.print("이름: "); // 강
		int nameBS = is.read(bs); // 읽어온 바이트 수를 저장 = 4
		// -80, -83, 13, 10, 0 0 0 0..
		String name = new String(bs, 0, nameBS - 2);
		System.out.print("하고싶은 말: "); // 없습니다 = 10
		int comment = is.read(bs); // -66, -8, -67, -64, -76, -49, -76, -39, 13, 10
		String com = new String(bs, 0, comment - 2);
		System.out.println("입력한 이름: " + name);
		System.out.println("입력한 하고싶은 말: " + com);

	}

}
