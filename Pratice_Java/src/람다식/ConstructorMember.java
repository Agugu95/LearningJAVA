package 람다식;

public class ConstructorMember {
	private String name;
	private String id;

	public ConstructorMember() {
		System.out.println("Member() 실행");
	}

	public ConstructorMember(String id) {
		System.out.println("String id 실행");
		this.id = id;
	}

	public ConstructorMember(String name, String id) {
		System.out.println("String name, String id 실행");
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
