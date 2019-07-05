package 예외처리;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
			System.out.println("success");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}
	}

	public static void findClass() throws ClassNotFoundException {
		Class class1 = Class.forName("java.lang.String");
	}

}
