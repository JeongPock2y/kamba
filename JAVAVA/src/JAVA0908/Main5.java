package JAVA0908;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("�б޿� ��� �ֳ���? :");
		int size = sc.nextInt();
		int[] a = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print((i + 1) + "�л��� ������ �Է��ϼ� : ");
			a[i] = sc.nextInt();

			sum += a[i];

		}
		System.out.print("�л����� :" + (double) sum / (double) size);

	}

}
