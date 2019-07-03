package 예외처리;

public class NullPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = null; // 비어있는 string 객체 참조 변수
		System.out.println(data.toString()); // 빈 참조를 통해 접근 string 객체의 toString()를 호출

	}

}
