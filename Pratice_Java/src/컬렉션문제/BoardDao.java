package 컬렉션문제;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

	public List<Board> getBoardList() {
		// TODO Auto-generated method stub
		List<Board> list = new ArrayList<>(); // 객체들을 저장 할 ArrayList
		list.add(new Board("제목1", "내용1")); // Board 타입의 객체를 추가
		list.add(new Board("제목2", "내용2"));
		return list;
	}

}
