package ���ٽ�;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Fruit> binaryOperator; // Fruit Ÿ�� ��ü�� �ް����
		Fruit fruit; // �͸� ��ü�� ���� FruitŸ�� ����

		binaryOperator = BinaryOperator.minBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 4300));
		System.out.println(fruit.name);

		binaryOperator = BinaryOperator.maxBy((f1, f2) -> Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("����", 6000), new Fruit("����", 4300));
		System.out.println(fruit.name);

	}

}
