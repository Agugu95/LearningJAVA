package �÷��������ӿ�ũ;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<>(); // �ڵ� Ÿ�� ����

		list.add(new Board("����1", "����1", "�۾���")); // 0
		list.add(new Board("����2", "����2", "�۾���2")); // 1
		list.add(new Board("����3", "����3", "�۾���3")); // 2
		list.add(new Board("����4", "����4", "�۾���4")); // 3
		list.add(new Board("����5", "����5", "�۾���5")); // 4

		list.remove(2); // 2�� �ε��� ���� �� �ε��� ��ĭ�� ����� 0 1 3 4
		list.remove(3); // 3�� �ε��� ���� 0 1 3

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.content + "\t" + board.subject + "\t" + board.writer);
		}
	}

}
