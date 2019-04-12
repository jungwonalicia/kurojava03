package java14;
import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file1 = new File("c:/temp2");
		if(file1.exists()) {
			System.out.println("해당 폴더가 존재합니다. ");
		}else {
			System.out.println("해당 폴더가 존재하지 않습니다. ");
		}
		
		System.out.println("-------------");

		//File =>드라이브, 폴더(디렉토리), 파일
		File dir = new File("c:/temp3");
		dir.mkdir();
		
		File test = new File("c:/temp2/t1/test.txt");
		File dir2 = new File("c:/temp3/test.txt");
		test.renameTo(dir2);

		if(dir2.exists()) {
			System.out.println("이동완료");
		}else {
			System.out.println("이동못함");
		}
		System.out.println("---------");
		System.out.println(file1.isDirectory());
		System.out.println(file1.isFile());
		String[] list = file1.list();
		System.out.println(list.length);
		System.out.println("---------");
		File drive = new File("c:");
		String[] cList = drive.list();
		System.out.println(cList.length);

		File file3 = new File("c:/temp3", "imsi.txt");
		File file4 = new File("c:/temp3/imsi.txt");		
		file3.createNewFile();
	}
}
