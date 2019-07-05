package api재정의;

public class SallowCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 원본 객체 생성
		SallowClone sa = new SallowClone("galaxy", "samsung", "12345", 25, true);

		// 복제 객체를 얻은 후 패스워드 변경
		SallowClone cloned = sa.getMember();
		cloned.pw = "1q2w3e4r";

		System.out.println("복제 객체의 필드 값");
		System.out.println(cloned.adult);
		System.out.println(cloned.pw);

		System.out.println();

		System.out.println("원본 객체의 필드 값");
		System.out.println(sa.adult);
		System.out.println(sa.pw);
	}

}
