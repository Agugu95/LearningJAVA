package ���׸�;

public class QusUtil {
	// ���׸� �޼ҵ�� static
	// public static Ÿ���Ķ���� Ÿ�� �޼ҵ��̸� (���׸� Ÿ��, ...)

//	public static <K, V> Integer getValue(QusPair<K, V> p, String key) {
	// K,V�� ���� String, int => Intger wraper Ŭ�������� ��ȯ�� �ʿ�
//		if (p.getKey().equals(key)) {
//			return (Integer)p.getValue();
// 		} else {
//			return null;
//		}
	public static <T extends QusPair<String, Integer>> Integer getValue(QusPair<String, Integer> p, String key) {
		// ������ ���� �ʰ� Ÿ�� �Ķ���͸� �״�� �޾��� ��
		if (p.getKey().equals(key)) {
			return p.getValue(); // p�� value �ʵ�� ���� Integer
		} else {
			return null;
		}
	}
}
