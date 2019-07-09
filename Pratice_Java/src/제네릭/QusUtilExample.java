package 제네릭;

public class QusUtilExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QusPair<String, Integer> pair = new QusPair<>("홍길동", 35);
		Integer age = QusUtil.getValue(pair, "홍길동");
		System.out.println(age);

		QusChildPair<String, Integer> childpair = new QusChildPair<>("홍삼원", 20);
		Integer childAge = QusUtil.getValue(childpair, "홍삼순");
		System.out.println(childAge);

//		QusOtherPair<String, Integer> otherPair = new QusOtherPair<String, Integer>("홍삼원", 30);
//		int otherAge = QusUtil.getValue(otherPair, "홍삼원");
//		System.out.println(otherAge);
//		제네릭 타입이 같더라도 제네릭 메소드에는 QusPair 와 그 자식 제네릭 클래스만 적용 된다.
// 		The method in the type is not applicable for the arguments 
	}

}
