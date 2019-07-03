package 예외처리;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int[] arr = new int[3];
		if (i <= arr.length) {
			System.out.print(arr[i]);
		} else {
			System.out.println("3이하로 입력하셔야 합니다.");
			System.out.println(arr[5]); // ArrayIndexOutOfBoundException
			// 배열의 인덱스를 벗어난 범위 지정
		}
	}
}
