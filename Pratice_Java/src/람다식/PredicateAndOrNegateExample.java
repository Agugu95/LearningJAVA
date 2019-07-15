package 람다식;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2의 배수 검사
		IntPredicate predicateA = a -> {
			return a % 2 == 0;
		};

		// 3의 배수 검사
		IntPredicate predicateB = (a) -> {
			return a % 3 == 0;
		};

		IntPredicate predicateAB;
		boolean result;

		// and()
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와 3의 배수인가? " + result);

		// or()
		predicateAB = predicateA.or(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수인가? " + result);

		// negate()
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);
	}

}
