package JAVA0909;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// ����ڰ� �������� ������ 5�� �Է¹޾Ƽ� ����ϴ� �ڵ�

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int max = 0;
		int min=0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i + 1) + "��° ������ �Է����ּ���");
			arr[i] = sc.nextInt();
			if(i==0) {
				max= arr[i];
				min =arr[i];
				continue;
			}

			if (max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
				
		}
		System.out.println(max);
		System.out.println(min);

	}
}
