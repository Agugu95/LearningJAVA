package api재정의;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Key 객체를 식별키로 사용ㅎ여 String 값을 저장하는 HashMape 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		// 식별키 "new Key(1)"로 저장
		hashMap.put(new Key(1), "pussyCat"); // 필드는 같지만 다른 객체

		// 식별키 "new Key(1)"로 홍길동 읽어옴
		String value = hashMap.get(new Key(1)); // 필드는 같지만 다른 객체
		System.out.println(value); // hashcode 오버라이딩 안할 시 null
		// hashcode 오버라이딩 시 다른 객체지만 논리적 동등 연산을 통해 동이 값으로 인식
		// equals == true && hashcode == true
	}

}
