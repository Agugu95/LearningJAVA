package ���ٽ�;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator binaryOperator;

		// ���� �޼ҵ��� ���ٽ� �޼ҵ� ����
		binaryOperator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("���1: " + binaryOperator.applyAsInt(1, 2));

		binaryOperator = Calculator::staticMethod;
		System.out.println("���2: " + binaryOperator.applyAsInt(3, 4));

		// �ν��Ͻ� �޼ҵ��� ���ٽ� �޼ҵ� ����
		Calculator calculator = new Calculator(); // �ν��Ͻ� �޼ҵ带 ����ϱ� ���� ��ü ����
		binaryOperator = (x, y) -> calculator.instanceMethod(x, y);
		System.out.println("���3: " + binaryOperator.applyAsInt(5, 6));

		binaryOperator = calculator::instanceMethod;
		System.out.println("���4: " + binaryOperator.applyAsInt(7, 8));
	}

}
