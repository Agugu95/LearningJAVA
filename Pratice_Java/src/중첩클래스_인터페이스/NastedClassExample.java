package 중첩클래스_인터페이스;

public class NastedClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myacar = new Car();

		Car.Tire tire = myacar.new Tire();
		// 외부에서 중첩 클래스의 참조를 얻기 위해선 바깥 클래스 객체를 생성하고
		// 클래스타입.중첩클래스타입 중첩클래스 이름 = 바깥 클래스 객체.new 중첩클래스();

		Car.Engine engine = new Car.Engine();
		// static 클래스는 클래스 객체 생성과 동시에 만들어질 수 있기에
		// 클래스타입.static중첩 클래스 = new 클래스.satic중첩클래스();
	}

}
