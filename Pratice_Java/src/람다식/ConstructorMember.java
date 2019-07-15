package ���ٽ�;

public class ConstructorMember {
	private String name;
	private String id;

	public ConstructorMember() {
		System.out.println("Member() ����");
	}

	public ConstructorMember(String id) {
		System.out.println("String id ����");
		this.id = id;
	}

	public ConstructorMember(String name, String id) {
		System.out.println("String name, String id ����");
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
