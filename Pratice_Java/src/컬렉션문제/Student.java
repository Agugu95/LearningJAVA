package 컬렉션문제;

public class Student {
	public int studentNum; // public 필드를 작성한다는건 직접 접근할 것
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
			Student student = (Student) obj; // Object가 제일 높은 타입이니 타입캐스팅 필요
			return student.studentNum == studentNum;
			// 파라미터로 들어온 obj객체의 studnetNum과 기존의 studentNum이 같다면 리턴
		} else
			return false;
	}

}
