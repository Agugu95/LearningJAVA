package �ڵ�Ÿ�Ժ�ȯ_�ڵ���;

public class Car {
	// Filed

	Tire tires[] = { new Tire("���� ���", 6), new Tire("���� ���", 2), new Tire("���� �ϴ�", 3), new Tire("���� �ϴ�", 4) };
	// �迭�� ���� ��ü ����, �ε����� ���� ����

	// Constructor
	// �̻��� �� �Ķ���Ͱ� ���� default ������ ����
	public Car() {
	}

	// Method
	int run() {
		System.out.println("START *******");
		if (tires[0].roll() == false) {
			stop();
			return 1;
		}
		if (tires[1].roll() == false) {
			stop();
			return 2;
		}
		if (tires[2].roll() == false) {
			stop();
			return 3;
		}
		if (tires[3].roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("STOP *******");
	}

}
