package array;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[5];
		int[] num = new int[5];
		
		//1. 5���� �л��鿡 ���� ������ �Է¹ް� �ͽ��ϴ�.
		for (int i = 0; i < 5; i++) {
			//2. �Է�: �̸� + ����
			System.out.println("�̸��� �Է��ϼ���...");
			name[i] = sc.next();
			System.out.println("������ �Է��ϼ���...");
			num[i] = sc.nextInt();
		}
		//��ü ���
		for (int i = 0; i < num.length; i++) {
			System.out.println(name[i] + " : " + num[i]);
		}
		
		//3. ��ü �л��� ����� ���� �ͽ��ϴ�.
		int sum = num[0] + num[1] + num[2] + num[3] + num[4];
		System.out.println("�л����� ����� : " + sum/5.0);
	}
}

