package ���ٽ�;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2�� ��� �˻�
		IntPredicate predicateA = a -> {
			return a % 2 == 0;
		};

		// 3�� ��� �˻�
		IntPredicate predicateB = (a) -> {
			return a % 3 == 0;
		};

		IntPredicate predicateAB;
		boolean result;

		// and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2�� 3�� ����ΰ�? " + result);

		// or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9�� 2 �Ǵ� 3�� ����ΰ�? " + result);

		// negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9�� Ȧ���Դϱ�? " + result);
	}

}
