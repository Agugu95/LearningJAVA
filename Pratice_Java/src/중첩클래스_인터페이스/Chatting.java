package ��øŬ����_�������̽�;

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
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickname + "]" + inputData;
					// �޼ҵ� ������ ������ ������� nickname local ��ü���� ��� �Ұ�
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
