package �÷��������ӿ�ũ;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) { // equals �������̵�
		if (obj instanceof Member) { // Member�� obj�� �ְ� name�� age���� ���ٸ�
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
