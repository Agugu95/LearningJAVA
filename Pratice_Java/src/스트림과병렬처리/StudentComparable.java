package 스트림과병렬처리;

public class StudentComparable implements Comparable<StudentComparable> {

	private String name;
	private int score;

	public StudentComparable(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(StudentComparable o) { // CompareTo 메소드 오버라이딩
		// TODO Auto-generated method stub
		return Integer.compare(score, o.score); // int 타입 반환해야하지만 primitive타입 적용 안되니 Integer 사용
		// 내부적으로 score < o.score = -1 과 같은 연산 수행
	}

}
