package api������;

import java.util.Arrays;

public class DeepClone implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;

	public DeepClone(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// ���� ���縦 ���� anme, age ����
		DeepClone cloned = (DeepClone) super.clone();

		// scores ���� ����
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car ���� ����
		cloned.car = new Car(this.car.model);
		// ���� ���� �� ��ü ����
		return cloned;
	}

	public DeepClone getMember() {
		DeepClone cloned = null;
		try {
			cloned = (DeepClone) clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cloned;
	}
}
