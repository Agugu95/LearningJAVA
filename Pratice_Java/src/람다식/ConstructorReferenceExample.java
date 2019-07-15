package 람다식;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceExample {
	public static void main(String args[]) {
		Function<String, ConstructorMember> function = ConstructorMember::new; // String 파라미터 1개 생성자 참조
		ConstructorMember constructorMember = function.apply("angel");
		System.out.println(constructorMember.getId());

		BiFunction<String, String, ConstructorMember> biFunction = ConstructorMember::new; // String 파라미터 2개 생성자 참조
		ConstructorMember constructorMember2 = biFunction.apply("NewAngel", "Angel");
		System.out.println(constructorMember2.getId());
	}
}
