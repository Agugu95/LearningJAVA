package �ڵ�Ÿ�Ժ�ȯ;

public class Vehicle_ForcedCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus_ForcedCast(); // �������̽� Ÿ������ �ڵ���ȯ Vehicle <- Bus

		vehicle.run();
		// vehicle.checkPare(); �������̽� Ÿ������ �ڵ���ȯ �Ʊ⿡ ���� Ŭ�������� �����ϴ� �޼ҵ� �Ұ�
		Bus_ForcedCast bus = new Bus_ForcedCast();
		bus = (Bus_ForcedCast) vehicle;
		bus.run();
		bus.checkFare();
	}

}
