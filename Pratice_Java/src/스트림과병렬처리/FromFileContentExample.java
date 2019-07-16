package ��Ʈ��������ó��;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContentExample {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Path path =
		// Paths.get("C:/cygwin64/home/git/LearningJAVA/Pratice_Java/src/��Ʈ��������ó��/a.txt");
		// // ����θ� ���� ����
		// ������ �����θ� ������ �ִ� path ��ü

		Path path = Paths.get("../a.txt"); // �����

		Stream<String> stream; // Stream ����

		// File.lines �޼ҵ� (�� ���� ��Ʈ�� ���� �б�)
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out::println);

		System.out.println();

		// BufferReader�� lines �޼ҵ�
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader BR = new BufferedReader(fileReader);
		stream = BR.lines();
		stream.forEach(System.out::println);

	}

}
