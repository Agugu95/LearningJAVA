package 예외처리;

public class NumberFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d1 = "100";
		String d2 = "a100";

		int v1 = Integer.parseInt(d1);
		double v2 = Double.parseDouble(d2);

		System.out.println(v1 + v2);
	}

}
