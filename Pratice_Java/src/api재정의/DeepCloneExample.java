package api재정의;

public class DeepCloneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 원본 객체 생성
		DeepClone original = new DeepClone("rwh", 25, new int[] { 90, 90 }, new Car("소나타"));

		// 복사 객체 생성
		DeepClone cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";

		System.out.println();
	}

}
