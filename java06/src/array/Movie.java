package array;
import java.util.Scanner;
public class Movie {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] seat = new int[10]; // �ڸ��� ���� �迭
		int count = 0; //���� ī��Ʈ
		
		while (true) {
			System.out.println("-------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "  ");
			}
			System.out.println();
			System.out.println("-------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.println("-------------------------------");
			System.out.print("������ �¼���ȣ �Է�(����:0) ->>>> ");
			int input = sc.nextInt();
			
			if(input == 0) {
				System.out.println("���� �ý����� �����մϴ�.");
				break;
			}
			//���Ż��¸� Ȯ��...
			if(seat[input-1] == 0) {
				count++;
				seat[input-1] = 1;//���� �Ϸ�
				System.out.println(input + "���� ���Ű� �Ϸ�Ǿ����ϴ�.");
			}else {
				System.out.println(input + "���� �̹� ���Ű� �� �ڸ��Դϴ�.");
				System.out.println("�ٸ� �ڸ��� �������ּ���..");
			}
		}//while end.
		System.out.println("����� ������ �� �ݾ��� : " + count * 7000);
	}

}
