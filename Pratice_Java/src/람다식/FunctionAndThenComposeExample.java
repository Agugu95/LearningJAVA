package 람다식;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Member, Address> functionA; // <Member객체, Address객체>
		Function<Address, String> functionB; // <Address객체, String타입>
		Function<Member, String> functionAB; // <Member객체, String타입>
		Function<Address, String> functionC; // <Address객체, String타입>
		String city;
		String country;

		functionA = (m) -> m.getAddress(); // Member를 받는 m파라미터
		functionB = (a) -> a.getCity(); // Address를 받는 a파라미터
		functionC = (a) -> a.getCountry(); // Address를 받는 a파라미터

		functionAB = functionA.andThen(functionB);
		// address를 반환하는 functionA로부터 address를 받아서 수행하는 functionB
		// functionB는 최종적으로 Member와 String(a.getCity())를 반환
		city = functionAB.apply(new Member("홍길동", "홍", new Address("한국", "서울")));
		// 매개값을 리턴값으로 매핑(타입변환)을 수행 Member, Address를 통해 functionA 호출
		System.out.println("거주 도시: " + city);

		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("훗쨔", "훗", new Address("한국", "서울")));
		System.out.println("거주 도시: " + city);

		functionAB = functionA.andThen(functionC);
		country = functionAB.apply(new Member("흣쨔", "흣", new Address("한국", "서울")));
		System.out.println("거주 국가: " + country);
	}

}
