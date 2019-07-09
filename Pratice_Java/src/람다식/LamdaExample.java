package 람다식;

public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;
		fi = () -> { // 익명 구현 객체 1
			String str = "method call";
			System.out.println(str);
		};
		fi.method();

		fi = () -> {
			System.out.println("method call 2"); // 익명 구현 객체 2
		};
		fi.method();

		fi = () -> System.out.println("method call 3"); // 하나의 실행문은 중괄호 생략 가능
		fi.method();

		ParameterFunctionalInterface pi;
		pi = (x) -> { // x의 값이 실행 코드로 대입
			int result = x * 5;
			System.out.println(result);
		};
		pi.method(9);

		ParameterAndReturn pa;
		pa = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.print(pa.method(5, 3));

		pa = (x, y) -> sum(x, y); // return만 존재할 경우 중괄호와 return 생략
		System.out.println(pa.method(5, 6));
	}

	public static int sum(int a, int b) {
		return (a + b);
	}

}
