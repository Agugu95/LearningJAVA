package 자동타입변환;

public class Vehicle_ForcedCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus_ForcedCast(); // 인터페이스 타입으로 자동변환 Vehicle <- Bus

		vehicle.run();
		// vehicle.checkPare(); 인터페이스 타입으로 자동변환 됐기에 구현 클래스에만 존재하는 메소드 불가
		Bus_ForcedCast bus = new Bus_ForcedCast();
		bus = (Bus_ForcedCast) vehicle;
		bus.run();
		bus.checkFare();
	}

}
