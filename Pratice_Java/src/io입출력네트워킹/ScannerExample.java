package io입출력네트워킹;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// inputStream 타입 필드 System.in을 util.scanner 파라미터로 사용
		System.out.print("문자열 입력: ");
		String inputString = sc.nextLine();
		System.out.println(inputString);
	}

}
