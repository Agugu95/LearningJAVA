package ¶÷´Ù½Ä;

import java.util.function.ToIntBiFunction;

public class ArgumentMethodReferencesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToIntBiFunction<String, String> biFunction;

		biFunction = (a, b) -> {
			return a.compareToIgnoreCase(b);
		};
		System.out.println(biFunction.applyAsInt("JAVA8", "JAVA8"));

		biFunction = String::compareToIgnoreCase;
		System.out.println(biFunction.applyAsInt("JAVA8", "JAVA8"));

	}
}
