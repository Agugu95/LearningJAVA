package api재정의;

public class Counter {

	private int no;

	public Counter(int no) {
		this.no = no;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "번 객체의 소멸자 실행");
	}
}
