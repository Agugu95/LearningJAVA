package 자동타입변환_자동차;

public class Car {
	// Filed

	Tire tires[] = { new Tire("좌측 상단", 6), new Tire("우측 상단", 2), new Tire("좌측 하단", 3), new Tire("우측 하단", 4) };
	// 배열을 통한 객체 생성, 인덱스를 통한 관리

	// Constructor
	// 미생성 시 파라미터가 없는 default 생성자 생성
	public Car() {
	}

	// Method
	int run() {
		System.out.println("START *******");
		if (tires[0].roll() == false) {
			stop();
			return 1;
		}
		if (tires[1].roll() == false) {
			stop();
			return 2;
		}
		if (tires[2].roll() == false) {
			stop();
			return 3;
		}
		if (tires[3].roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("STOP *******");
	}

}
