package �ڵ�Ÿ�Ժ�ȯ_�ڵ���;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); // Car ��ü�� run �޼ҵ� 5�� ����, ���ϰ� ����

			switch (problemLocation) {
			case 1:
				System.out.println("������� HankookTire�� ��ü");
				car.tires[0] = new HankookTire("�������", 15);
				break;
			case 2:
				System.out.println("������� KumhoTire�� ��ü");
				car.tires[1] = new KumhoTire("�������", 10);
				break;
			case 3:
				System.out.println("�����ϴ� HankookTire�� ��ü");
				car.tires[2] = new HankookTire("�����ϴ�", 13);
				break;
			case 4:
				System.out.println("�����ϴ� KumhoTire�� ��ü");
				car.tires[3] = new KumhoTire("�����ϴ�", 12);
				break;
			default:
				break;
			}
			System.out.println("��� ���� ------------------");
		}
	}

}
