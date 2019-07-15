package 컬렉션프레임워크;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();

		long startTime; // 시작 시간
		long endTime; // 종료 시간

		startTime = System.nanoTime(); // 시스템 시간을 시작 시간으로 맞춤
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));

		}
		System.out.println(list1);
		endTime = System.nanoTime(); // 종료 시간을 메소드만큼 시간이 흐른 시스템 시간으로 다시 설정
		System.out.println("걸린 시간: " + (endTime - startTime) + "ns");

		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));

		}
		System.out.println(list2);
		endTime = System.nanoTime();
		System.out.println("걸린 시간: " + (endTime - startTime) + "ns");
	}

}
