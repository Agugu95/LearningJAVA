package api¿Á¡§¿«;

public class SallowClone implements Cloneable {
	public String id;
	public String name;
	public String pw;
	public int age;
	public boolean adult;

	public SallowClone(String id, String name, String pw, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.age = age;
		this.adult = adult;
	}

	public SallowClone getMember() {
		SallowClone cloned = null;
		try {
			cloned = (SallowClone) clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
		}
		return cloned;

	}
}
