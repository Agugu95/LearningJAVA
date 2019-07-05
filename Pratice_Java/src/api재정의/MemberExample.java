package api재정의;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3은 동등합니다");
		} else {
			System.out.println("obj1과 obj3은 다릅니다.");
		}
	}
}
