package 스트림과병렬처리;

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
		// Paths.get("C:/cygwin64/home/git/LearningJAVA/Pratice_Java/src/스트림과병렬처리/a.txt");
		// // 상대경로를 통해 얻음
		// 파일의 절대경로를 가지고 있는 path 객체

		Path path = Paths.get("../a.txt"); // 상대경로

		Stream<String> stream; // Stream 생성

		// File.lines 메소드 (행 단위 스트림 파일 읽기)
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out::println);

		System.out.println();

		// BufferReader의 lines 메소드
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader BR = new BufferedReader(fileReader);
		stream = BR.lines();
		stream.forEach(System.out::println);

	}

}
