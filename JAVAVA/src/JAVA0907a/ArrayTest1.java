package JAVA0907a;

import java.util.Scanner;

public class ArrayTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���! : ");
		int ArrLength = sc.nextInt();
		int[] intArr = new int[ArrLength];
		for (int i = 0; i < ArrLength; i++) {
			System.out.println("--------");
			System.out.print((i+1)+"��° �����Է�");
		
			intArr[i] = sc.nextInt();
		}
		System.out.println("�迭�� ���̴� :"+ArrLength);
		System.out.println("@@@@@@@@@@");
		for (int i = 0; i < ArrLength; i++) {
			
			System.out.println("intArr["+i+"]�� ���� :"+intArr[i]);

		}
	}
}
