package io입출력네트워킹;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileWriter writer = new FileWriter("./test.txt");
			char[] chardata = "abc".toCharArray();
			for (int i = 0; i < chardata.length; i++) {
				writer.write(chardata[i]);
				writer.flush();
				writer.close();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
