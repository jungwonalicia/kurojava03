import java.io.File;

public class FileTest3 {

	public static void main(String[] args) {
		//1. 폴더나 파일을 만들어라.
		File f1 = new File("c:/temp3");
		File f2 = new File("c:/temp2/t3");
		//2. 위치를 찾아가라.
		f1.mkdir();
		f2.mkdir();
	}

}
