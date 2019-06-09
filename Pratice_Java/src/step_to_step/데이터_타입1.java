package step_to_step;

public class 데이터_타입1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[1];
		num[0] = 1;
		int[] num2 = new int[1];
		num2[0] = 2;

		num[0] = num2[0];
		System.out.println(num[0] + " " + num2[0]);

		System.out.println(num[0] + " " + num2[0]);
	}

}
