package ���׸�;

public class QusUtilExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QusPair<String, Integer> pair = new QusPair<>("ȫ�浿", 35);
		Integer age = QusUtil.getValue(pair, "ȫ�浿");
		System.out.println(age);

		QusChildPair<String, Integer> childpair = new QusChildPair<>("ȫ���", 20);
		Integer childAge = QusUtil.getValue(childpair, "ȫ���");
		System.out.println(childAge);

//		QusOtherPair<String, Integer> otherPair = new QusOtherPair<String, Integer>("ȫ���", 30);
//		int otherAge = QusUtil.getValue(otherPair, "ȫ���");
//		System.out.println(otherAge);
//		���׸� Ÿ���� ������ ���׸� �޼ҵ忡�� QusPair �� �� �ڽ� ���׸� Ŭ������ ���� �ȴ�.
// 		The method in the type is not applicable for the arguments 
	}

}
