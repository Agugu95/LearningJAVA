package 자동타입변환;

public class Bus_ForcedCast implements Vehicle {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("버스가 달립니다.");
	}

	public void checkFare() {
		System.out.println("승차요금을 체크합니다.");
	}
}
