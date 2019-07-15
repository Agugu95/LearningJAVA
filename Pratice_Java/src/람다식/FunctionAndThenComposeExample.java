package ���ٽ�;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Member, Address> functionA; // <Member��ü, Address��ü>
		Function<Address, String> functionB; // <Address��ü, StringŸ��>
		Function<Member, String> functionAB; // <Member��ü, StringŸ��>
		Function<Address, String> functionC; // <Address��ü, StringŸ��>
		String city;
		String country;

		functionA = (m) -> m.getAddress(); // Member�� �޴� m�Ķ����
		functionB = (a) -> a.getCity(); // Address�� �޴� a�Ķ����
		functionC = (a) -> a.getCountry(); // Address�� �޴� a�Ķ����

		functionAB = functionA.andThen(functionB);
		// address�� ��ȯ�ϴ� functionA�κ��� address�� �޾Ƽ� �����ϴ� functionB
		// functionB�� ���������� Member�� String(a.getCity())�� ��ȯ
		city = functionAB.apply(new Member("ȫ�浿", "ȫ", new Address("�ѱ�", "����")));
		// �Ű����� ���ϰ����� ����(Ÿ�Ժ�ȯ)�� ���� Member, Address�� ���� functionA ȣ��
		System.out.println("���� ����: " + city);

		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("��¹", "��", new Address("�ѱ�", "����")));
		System.out.println("���� ����: " + city);

		functionAB = functionA.andThen(functionC);
		country = functionAB.apply(new Member("��¹", "��", new Address("�ѱ�", "����")));
		System.out.println("���� ����: " + country);
	}

}
