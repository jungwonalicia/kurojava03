package switchTest;

import java.util.Scanner;

public class SwitchTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����� ȸ��ID�� �Է��ϼ���.>>>> ");
		String id = sc.next();
		
		char dept = id.charAt(0);
		switch (dept) {
		case 'i':
			System.out.println("IT�μ� �̱���.");
			break;
		case 'p':
			System.out.println("��ȹ�μ� �̱���.");
			break;
		case 's':
			System.out.println("Ư���μ� �̱���.");
			break;
		default:
			System.out.println("�ش� �μ��� �����.");
			break;
		}
		
		
		
	}

}



