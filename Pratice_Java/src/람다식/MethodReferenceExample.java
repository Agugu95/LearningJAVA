package 람다식;

import java.util.function.IntBinaryOperator;

public class MethodReferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntBinaryOperator binaryOperator;

		// 정적 메소드의 람다식 메소드 참조
		binaryOperator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + binaryOperator.applyAsInt(1, 2));

		binaryOperator = Calculator::staticMethod;
		System.out.println("결과2: " + binaryOperator.applyAsInt(3, 4));

		// 인스턴스 메소드의 람다식 메소드 참조
		Calculator calculator = new Calculator(); // 인스턴스 메소드를 사용하기 위한 객체 생성
		binaryOperator = (x, y) -> calculator.instanceMethod(x, y);
		System.out.println("결과3: " + binaryOperator.applyAsInt(5, 6));

		binaryOperator = calculator::instanceMethod;
		System.out.println("결과4: " + binaryOperator.applyAsInt(7, 8));
	}

}
