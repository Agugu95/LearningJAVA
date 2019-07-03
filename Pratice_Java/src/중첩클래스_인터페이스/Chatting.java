package 중첩클래스_인터페이스;

public class Chatting {

	void startChar(String chatID) {
		String nickname = null;
		// final String nickname = chatID;
		nickname = chatID;
		Chat chat = new Chat() {
			@Override
			public void start() {
				// String nickname = chatID;
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickname + "]" + inputData;
					// 메소드 실행이 끝나면 사라지는 nickname local 객체에서 사용 불가
					sendMessage(message);
				}
			}
		};
		chat.start();
	}

	class Chat {
		void start() {
		}

		void sendMessage(String message) {

		}
	}

	public static void main(String args[]) {
		Chatting chatting = new Chatting();
	}
}
