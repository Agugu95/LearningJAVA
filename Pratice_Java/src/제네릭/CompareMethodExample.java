package 제네릭;

public class CompareMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair<Integer, String> p1 = new Pair<>(1, "사과"); // 멀티 제네릭 파라미터 추정 <>
		Pair<Integer, String> p2 = new Pair<Integer, String>(1, "사과"); // 멀티 제네릭 파라미터 명시
		boolean result1 = CompareUtil.<Integer, String>compare(p1, p2); // 제네릭 타입 명시
		if (result1) {
			System.out.println("논리적 동등 객체");
		} else {
			System.out.println("논리적으로 동등하지 않음");
		}

		Pair<String, String> p3 = new Pair<>("사과", "바나나");
		Pair<String, String> p4 = new Pair<String, String>("사과", "오렌지");
		boolean result2 = CompareUtil.compare(p3, p4);
		if (result2) {
			System.out.println("논리적 동등 객체");
		} else {
			System.out.println("동등하지 않음");
		}
	}

}
