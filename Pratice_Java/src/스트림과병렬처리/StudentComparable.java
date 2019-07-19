package ��Ʈ��������ó��;

public class StudentComparable implements Comparable<StudentComparable> {

	private String name;
	private int score;

	public StudentComparable(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(StudentComparable o) { // CompareTo �޼ҵ� �������̵�
		// TODO Auto-generated method stub
		return Integer.compare(score, o.score); // int Ÿ�� ��ȯ�ؾ������� primitiveŸ�� ���� �ȵǴ� Integer ���
		// ���������� score < o.score = -1 �� ���� ���� ����
	}

}
