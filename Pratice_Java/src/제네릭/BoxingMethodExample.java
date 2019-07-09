package 제네릭;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1 = Util.<Integer>boxing(100); // 명시적 타입 적시
		int intValue = box1.get();

		Box<String> box2 = Util.boxing("홍길동"); // 파라미터를 통한 타입 추정
		String strValue = box2.get();
	}

}
