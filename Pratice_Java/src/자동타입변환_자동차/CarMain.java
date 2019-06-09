package 자동타입변환_자동차;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();

		for (int i = 1; i <= 5; i++) {
			int problemLocation = car.run(); // Car 객체의 run 메소드 5번 실행, 리턴값 저장

			switch (problemLocation) {
			case 1:
				System.out.println("좌측상단 HankookTire로 교체");
				car.tires[0] = new HankookTire("좌측상단", 15);
				break;
			case 2:
				System.out.println("우측상단 KumhoTire로 교체");
				car.tires[1] = new KumhoTire("우측상단", 10);
				break;
			case 3:
				System.out.println("좌측하단 HankookTire로 교체");
				car.tires[2] = new HankookTire("좌측하단", 13);
				break;
			case 4:
				System.out.println("우측하단 KumhoTire로 교체");
				car.tires[3] = new KumhoTire("우측하단", 12);
				break;
			default:
				break;
			}
			System.out.println("출력 구분 ------------------");
		}
	}

}
