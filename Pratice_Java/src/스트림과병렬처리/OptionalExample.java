package ��Ʈ��������ó��;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>(); // �� ����Ʈ ����

		// ���� �߻� ��Ʈ��
		try {
			double avg = list.stream().mapToInt(Integer::intValue).average().getAsDouble();
		} catch (Exception e) {
			System.out.println(e); // ���� �����Ƿ� NoSuchElementException
		}

		// isPresent�� �̿��� t/f �Ǻ�
		OptionalDouble double1 = list.stream().mapToInt(Integer::intValue).average();
		if (double1.isPresent()) {
			System.out.println("isPresnet: " + double1.getAsDouble());
		} else
			System.out.println("isPresent: false ");

		// orElse default �� �̿�
		double avg2 = list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
		System.out.println("orElse: " + avg2);

		// ifPresnet ���ٽ��̿�
		list.stream().mapToInt(Integer::intValue).average().ifPresent(a -> System.out.println("ifPresent :" + a));
	}

}
