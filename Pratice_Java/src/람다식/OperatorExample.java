package 람다식;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 92, 38, 42 };

	public static int maxOrMin(IntBinaryOperator operator) { // 인터페이스 타입 받음
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score); // 람다식 실행
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
		System.out.println("최대값: " + max);

		int min = maxOrMin((a, b) -> {
			if (a <= b)
				return a;
			else
				return b;
		});
		System.out.println("최소값: " + min);

	}

}
