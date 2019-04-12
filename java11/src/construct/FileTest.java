package construct;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("iamfile.txt");
		file.write("hello\n");
		file.write("hi\n");
		file.close();
	}
}
