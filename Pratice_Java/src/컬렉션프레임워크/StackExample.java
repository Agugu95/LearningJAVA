package �÷��������ӿ�ũ;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>(); // Stack �÷��� ����
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(90));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(50));

		while (!coinBox.isEmpty()) { // stack�� ������� Ȯ��
			Coin coin = coinBox.pop(); // ��ü�� ������ ���ÿ��� ����
			System.out.println("���� ����: " + coin.getCoin());
		}
	}

}
