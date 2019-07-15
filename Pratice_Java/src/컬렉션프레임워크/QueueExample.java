package �÷��������ӿ�ũ;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> queue = new LinkedList<Message>();

		queue.offer(new Message("sendMail", "ȫ�浿"));
		queue.offer(new Message("sendMMS", "�ſ��"));
		queue.offer(new Message("sendKakaotalk", "��ī"));

		while (!queue.isEmpty()) { // queue�� ������� �ʴٸ�
			Message message = queue.poll(); // queue ��ü�� �ϳ��� ������
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "�Կ��� ������ �����ϴ�.");
				break;
			case "sendMMS":
				System.out.println(message.to + "�Կ��� MMS�� �����ϴ�.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "�Կ��� īī������ �����ϴ�");
				break;

			default:
				break;
			}
		}
	}

}
