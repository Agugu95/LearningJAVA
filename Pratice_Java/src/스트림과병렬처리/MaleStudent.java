package ��Ʈ��������ó��;

import java.util.ArrayList;
import java.util.List;

public class MaleStudent {
	private List<StudentToList> list; // ��Ҹ� ������ �÷���

	public MaleStudent() {
		list = new ArrayList<StudentToList>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}

	public void accumulator(StudentToList stlist) { // ��� ���� �޼ҵ�
		list.add(stlist);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulator");
	}

	public void combine(MaleStudent other) { // �� MaleStudent�� �����ϴ� �޼ҵ�(����ó��)
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}

	public List<StudentToList> getList() { // ��Ұ� ���� �� �÷��� ����
		return list;
	}
}
