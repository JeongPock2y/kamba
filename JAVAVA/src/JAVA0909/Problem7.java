package JAVA0909;

import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0.0;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° �л��� ���� :");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		avg = (sum / arr.length);
		System.out.print("������� :" + avg);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			if (avg <= arr[i]) {
				System.out.print((i + 1) + "�л��� ���� :" + arr[i]);
				System.out.println();
			}
		}

	}

}
