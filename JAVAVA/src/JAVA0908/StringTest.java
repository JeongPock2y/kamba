package JAVA0908;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num; //������ ������ ����
		String str;//���ڿ� ������ ����
		
		System.out.print("������ �Է��� �ּ���");
		num =sc.nextInt(); //����� ������ ������ 3�� ����
		
		sc.nextLine();// �갡  �Ʒ� ��¿�  ������ �����°ɸ�����  enter
		System.out.print("���ڿ��� �Է����ּ���");
		str = sc.nextLine(); // �ʿ��� ��������
		
		System.out.println(num);
		System.out.println(str);
	}

}
