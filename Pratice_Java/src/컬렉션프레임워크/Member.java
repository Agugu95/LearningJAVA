package 컬렉션프레임워크;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) { // equals 오버라이딩
		if (obj instanceof Member) { // Member에 obj가 있고 name과 age값이 같다면
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}
