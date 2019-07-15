package ���ٽ�;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 38, 42 };

	public static int maxOrMin(IntBinaryOperator operator) { // �������̽� Ÿ�� ����
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score); // ���ٽ� ����
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = maxOrMin((a, b) -> { // a, b = result, score
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("�ִ밪: " + max);

		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("�ּҰ�: " + min);

	}

}
