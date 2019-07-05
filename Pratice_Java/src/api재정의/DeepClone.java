package api재정의;

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
		// 얕은 복사를 통한 anme, age 복사
		DeepClone cloned = (DeepClone) super.clone();

		// scores 깊은 복사
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car 깊은 복사
		cloned.car = new Car(this.car.model);
		// 깊은 복사 된 객체 리턴
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
