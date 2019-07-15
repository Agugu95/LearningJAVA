package 컬렉션프레임워크;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Message> queue = new LinkedList<Message>();

		queue.offer(new Message("sendMail", "홍길동"));
		queue.offer(new Message("sendMMS", "신용권"));
		queue.offer(new Message("sendKakaotalk", "스카"));

		while (!queue.isEmpty()) { // queue가 비어있지 않다면
			Message message = queue.poll(); // queue 객체를 하나씩 꺼내옴
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보냅니다.");
				break;
			case "sendMMS":
				System.out.println(message.to + "님에게 MMS를 보냅니다.");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에게 카카오톡을 보냅니다");
				break;

			default:
				break;
			}
		}
	}

}
