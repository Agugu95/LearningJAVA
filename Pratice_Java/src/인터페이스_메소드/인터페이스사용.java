package 인터페이스_메소드;

public class 인터페이스사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		추상메소드[] rc = { new 구현클래스(), new 구현클래스2() };
		rc[0].turnOn();
		rc[0].turnOff();
		rc[0].setMute(true);
		rc[1].turnOn();
		rc[1].turnOff();
		rc[1].setMute(true);
		추상메소드.changeBattery();
	}
}
