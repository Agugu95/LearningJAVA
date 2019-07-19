package 스트림과병렬처리;

public class StudentToList {
	public enum Sex {
		MALE, FEMALE
	};

	public enum City {
		Seoul, Busan
	};

	private String name;
	private int age;
	private Sex sex;
	private City city;

	public StudentToList(String name, int age, Sex sex) {
		this.age = age;
		this.name = name;
		this.sex = sex;
	}

	public StudentToList(String name, int age, Sex sex, City city) {
		this.age = age;
		this.name = name;
		this.sex = sex;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Sex getSex() {
		return sex;
	}

	public City getCity() {
		return city;
	}
}
