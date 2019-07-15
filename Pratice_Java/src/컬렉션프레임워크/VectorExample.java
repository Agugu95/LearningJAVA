package 컬렉션프레임워크;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Board> list = new Vector<>(); // 자동 타입 추정

		list.add(new Board("제목1", "내용1", "글쓴이")); // 0
		list.add(new Board("제목2", "내용2", "글쓴이2")); // 1
		list.add(new Board("제목3", "내용3", "글쓴이3")); // 2
		list.add(new Board("제목4", "내용4", "글쓴이4")); // 3
		list.add(new Board("제목5", "내용5", "글쓴이5")); // 4

		list.remove(2); // 2번 인덱스 삭제 후 인덱스 한칸씩 당겨짐 0 1 3 4
		list.remove(3); // 3번 인덱스 삭제 0 1 3

		for (int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.content + "\t" + board.subject + "\t" + board.writer);
		}
	}

}
