import java.io.File;
import java.io.IOException;

public class FileTest2 {

	public static void main(String[] args) throws IOException {
//		//1. 폴더나 파일을 만들어라.
//		File f1 = new File("c:/temp3");
//		
//		//2. 위치를 찾아가라.
//		f1.mkdir();
//		
//		File f2 = new File("c:/temp3/test.txt");
//		f2.createNewFile();		
		
		System.out.println();
		File f3 = new File("c:/");
		String[] list = f3.list();
		System.out.println(list.length);
		for (String name : list) {
			System.out.println(name);
		}
		
		File f4 = new File("c:/temp2");
		System.out.println(f4.getName()); //폴더이름
		System.out.println(f4.getPath());
		System.out.println(f4.isDirectory());
		System.out.println(f4.getParent());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
