package �÷��ǹ���;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		List<Board> list = new ArrayList<>(); // ��ü���� ���� �� ArrayList
		list.add(new Board("����1", "����1")); // Board Ÿ���� ��ü�� �߰�
		list.add(new Board("����2", "����2"));
		return list;
	}

}
