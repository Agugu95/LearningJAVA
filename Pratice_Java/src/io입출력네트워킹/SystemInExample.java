package io입출력네트워킹;

import java.io.IOException;
import java.io.InputStream;

public class SystemInExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메뉴");
		System.out.println("1. 예금 조회");
		System.out.println("2. 출금 조회");
		System.out.println("3. 예금 출금");
		System.out.println("4. 예금 입금");
		System.out.println("5. 종료 하기");
		System.out.println("메뉴를 선택 하세요");

		InputStream io = System.in;
		try {
			char inputChar = (char) io.read();
			switch (inputChar) {
			case '1':
				System.out.println("예금조회");
				break;
			case '2':
				System.out.println("출금조회");
				break;
			case '3':
				System.out.println("예금출금");
				break;
			case '4':
				System.out.println("예금입금");
				break;
			case '5':
				System.out.println("종료");
				break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
