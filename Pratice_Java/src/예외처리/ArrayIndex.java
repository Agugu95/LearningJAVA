package ����ó��;

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
			System.out.println("3���Ϸ� �Է��ϼž� �մϴ�.");
			System.out.println(arr[5]); // ArrayIndexOutOfBoundException
			// �迭�� �ε����� ��� ���� ����
		}
	}
}
