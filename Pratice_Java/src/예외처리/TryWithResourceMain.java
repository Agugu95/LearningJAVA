package 예외처리;

public class TryWithResourceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
