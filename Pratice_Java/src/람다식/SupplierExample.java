package ���ٽ�;

import java.util.function.IntSupplier;

public class SupplierExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			IntSupplier intSupplier = () -> {
				int num = (int) (Math.random() * 6) + 1;
				return num;

			};

			int num = intSupplier.getAsInt();
			System.out.println("���� ��: " + num);
			if (num == 6)
				break;
		}
	}
}
