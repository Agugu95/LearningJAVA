package ¶÷´Ù½Ä;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");

		BiConsumer<String, String> biConsumer = (t, u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");

		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8);

		ObjIntConsumer<String> intConsumer = (t, i) -> System.out.println(t + i);
		intConsumer.accept("Java", 8);
	}

}
