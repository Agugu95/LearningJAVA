package ���ٽ�;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};
		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};
		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("ȫ�浿", "hong", null));
	}

}
