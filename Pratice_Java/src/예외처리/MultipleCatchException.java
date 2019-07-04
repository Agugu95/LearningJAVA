package 예외처리;

public class MultipleCatchException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(result);
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			// TODO: handle exception
			System.out.println("매개값이 부족하거나 변환 불가");
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("재실행하세요");
		}
	}

}
