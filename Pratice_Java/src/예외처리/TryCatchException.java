package 예외처리;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class clazz = Class.forName("java.lnag.String2");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} finally {
			// TODO: handle finally clause
			System.out.println("wowowow");
		}
	}
}
