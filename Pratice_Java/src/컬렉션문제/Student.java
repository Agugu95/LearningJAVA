package �÷��ǹ���;

public class Student {
	public int studentNum; // public �ʵ带 �ۼ��Ѵٴ°� ���� ������ ��
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj; // Object�� ���� ���� Ÿ���̴� Ÿ��ĳ���� �ʿ�
			return student.studentNum == studentNum;
			// �Ķ���ͷ� ���� obj��ü�� studnetNum�� ������ studentNum�� ���ٸ� ����
		} else
			return false;
	}

}
