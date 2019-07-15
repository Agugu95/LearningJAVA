package 람다식;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Fruit> binaryOperator; // Fruit 타입 객체를 받고싶은
		Fruit fruit; // 익명 객체를 위한 Fruit타입 변수

		binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("포도", 4300));
		System.out.println(fruit.name);

		binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("포도", 4300));
		System.out.println(fruit.name);

	}

}
