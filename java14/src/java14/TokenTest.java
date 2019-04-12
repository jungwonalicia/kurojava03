package java14;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		String str1 = "나른한 오후";
		String str2 = "2019/04/04";
		
		StringTokenizer tokens1 
			= new StringTokenizer(str1);
		StringTokenizer tokens2 
			= new StringTokenizer(str2, "/");
		
		System.out.println(tokens1.countTokens());
		System.out.println(tokens2.countTokens());
		while (tokens1.hasMoreTokens()) {
			System.out.println(tokens1.nextToken());
		}
		while (tokens2.hasMoreTokens()) {
			System.out.println(tokens2.nextToken());
		}
		
	}

}





