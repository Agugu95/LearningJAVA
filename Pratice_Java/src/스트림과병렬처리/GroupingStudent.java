package 스트림과병렬처리;

public class GroupingStudent {
	public enum Sex {
		MALE, FEMALE
	};

	private String name;
	private int score;
	private Sex sex;

	public GroupingStudent(String name, int score, Sex sex) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Sex getSex() {
		return sex;
	}
}
