package JAVA0910;

import java.util.Random;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int numRan = ran.nextInt(50) + 1;
		System.out.println(numRan);
		System.out.println("1-50������ ������ ���ڰ� �����Ǿ����ϴ�.");
		
		while (true) {
			System.out.print("���ڸ� �Է��Ͽ� �����ּ��� :");
			int num = sc.nextInt();
			if (numRan > num) {
				System.out.println("Down");
				continue;
			}
			else if (numRan < num) {
				System.out.println("UP");
				continue;
			}
			else if(numRan==num) {
				System.out.println("Good");
				break;
			}

		}

	}

}
