package 제네릭;

public class BoundedUtil {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); // Number 클래스에 정의 된 메소드
		double v2 = t2.doubleValue(); // 숫자를 double 타입으로 변환
		return Double.compare(v1, v2); //
	}
}
