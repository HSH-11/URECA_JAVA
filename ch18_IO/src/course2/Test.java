package course2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Test {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/test.txt");

		char a = 'A';
		writer.write(a);
		char b = 'B';
		writer.write(b);
		// ch 배열
		char[] array = { 'C', 'D', 'E' };
		writer.write(array);

		// 문자열
		writer.write("FGH");

		writer.flush();
		writer.close();

		// 문자
		Reader reader = new FileReader("C:/Temp/test.txt");

		// 1문자씩;
		while (true) {
			int data = reader.read();
			if (data == -1)
				break;
			System.out.print((char) data); // 숫자(문자의 정수표현) 대신 문자로 표현하기 위해 casting
		}
		System.out.println();
		reader.close();

		reader = new FileReader("C:/Temp/test.txt");

		// 배열에
		char[] data = new char[100];
		int num = reader.read(data);
		for (int i = 0; i < num; i++) {
			System.out.print(data[i]);
		}

		reader.close();
	}

}
