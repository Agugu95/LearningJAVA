package step_to_step;

public class Class_Constructor {
	String name;

	public String getName(String name) {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getJobs() {
		return jobs;
	}

	public void setJobs(String jobs) {
		this.jobs = jobs;
	}

	String age;
	String jobs;

	public Class_Constructor(String name, String age) {
		this(name, age, "250");
	}

	public Class_Constructor(String name, String age, String jobs) {
		this.name = name;
		this.age = age;
		this.jobs = jobs;
	}

	public Class_Constructor(int... is) {
		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
		}
	}

	public void print() {
		System.out.println(name + " " + age + jobs);
	}
}
