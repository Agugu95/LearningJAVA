package 제네릭;

public class ContainerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Container<String> container1 = new Container<>();
		container1.set("홍길동");
		String str = container1.get();

		Container<Integer> container2 = new Container<>();
		container2.set(6);
		int num = container2.get();

		System.out.println(str + num);

		ContainerMulti<String, String> containerMulti1 = new ContainerMulti<>();
		containerMulti1.set("사과", "오렌지");
		String apple = containerMulti1.getKey();
		String orange = containerMulti1.getValue();
		System.out.println(apple + " " + orange);

		ContainerMulti<Integer, String> containerMulti2 = new ContainerMulti<>();
		containerMulti2.set(10, orange);
		int value = containerMulti2.getKey();
		String product = containerMulti2.getValue();
		System.out.println(value + " " + product);

	}

}
