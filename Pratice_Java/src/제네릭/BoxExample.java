package Á¦³×¸¯;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxExample boxExample = new BoxExample();
		Box<String> box = boxExample.new Box<String>();
		box.set("hello");
		String str = box.get();
		System.out.println(str);

		Box<Integer> box2 = boxExample.new Box<Integer>();
		box2.set(6);
		int num = box2.get();
		System.out.println(num);

	}

	public class Box<T> {
		private T t;

		public T get() {
			return t;
		}

		public void set(T t) {
			this.t = t;
		}
	}
}
