package ��øŬ����_�������̽�;

public class NastedClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myacar = new Car();

		Car.Tire tire = myacar.new Tire();
		// �ܺο��� ��ø Ŭ������ ������ ��� ���ؼ� �ٱ� Ŭ���� ��ü�� �����ϰ�
		// Ŭ����Ÿ��.��øŬ����Ÿ�� ��øŬ���� �̸� = �ٱ� Ŭ���� ��ü.new ��øŬ����();

		Car.Engine engine = new Car.Engine();
		// static Ŭ������ Ŭ���� ��ü ������ ���ÿ� ������� �� �ֱ⿡
		// Ŭ����Ÿ��.static��ø Ŭ���� = new Ŭ����.satic��øŬ����();
	}

}
