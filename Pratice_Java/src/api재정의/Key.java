package api재정의;

public class Key {
	public int num;

	public Key(int num) {
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) { // equals만 재정의
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.num == compareKey.num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return num;
	}
}
