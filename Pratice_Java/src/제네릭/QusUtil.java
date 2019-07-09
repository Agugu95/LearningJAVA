package 제네릭;

public class QusUtil {
	// 제네릭 메소드는 static
	// public static 타입파라미터 타입 메소드이름 (제네릭 타입, ...)

//	public static <K, V> Integer getValue(QusPair<K, V> p, String key) {
	// K,V는 현재 String, int => Intger wraper 클래스로의 변환이 필요
//		if (p.getKey().equals(key)) {
//			return (Integer)p.getValue();
// 		} else {
//			return null;
//		}
	public static <T extends QusPair<String, Integer>> Integer getValue(QusPair<String, Integer> p, String key) {
		// 제한을 걸지 않고 타입 파라미터를 그대로 받았을 때
		if (p.getKey().equals(key)) {
			return p.getValue(); // p의 value 필드는 현재 Integer
		} else {
			return null;
		}
	}
}
