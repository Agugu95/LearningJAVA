package 컬렉션프레임워크;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>(); // Stack 컬렉션 생성
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(90));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(50));

		while (!coinBox.isEmpty()) { // stack이 비었는지 확인
			Coin coin = coinBox.pop(); // 객체를 꺼내고 스택에서 삭제
			System.out.println("꺼낸 동전: " + coin.getCoin());
		}
	}

}
