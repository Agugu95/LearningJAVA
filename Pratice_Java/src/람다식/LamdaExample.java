package ���ٽ�;

public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;
		fi = () -> { // �͸� ���� ��ü 1
			String str = "method call";
			System.out.println(str);
		};
		fi.method();

		fi = () -> {
			System.out.println("method call 2"); // �͸� ���� ��ü 2
		};
		fi.method();

		fi = () -> System.out.println("method call 3"); // �ϳ��� ���๮�� �߰�ȣ ���� ����
		fi.method();

		ParameterFunctionalInterface pi;
		pi = (x) -> { // x�� ���� ���� �ڵ�� ����
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

		pa = (x, y) -> sum(x, y); // return�� ������ ��� �߰�ȣ�� return ����
		System.out.println(pa.method(5, 6));
	}

	public static int sum(int a, int b) {
		return (a + b);
	}

}
