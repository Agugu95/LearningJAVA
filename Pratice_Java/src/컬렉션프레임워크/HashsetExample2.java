package 컬렉션프레임워크;

import java.util.HashSet;
import java.util.Set;

public class HashsetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<>();

		set.add(new Member("홍길동", 30)); // 값은 같은 다른 인스턴스
		set.add(new Member("홍길동", 30)); // 값은 같은 다른 인스턴스
		String string = new String();

		System.out.println(set.size()); // 다른 인스턴스지만 오버라이딩한 equals를 통한 중복 저장 제거
	}

}
