package JAVA0904;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a,a10,a1,sum;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ϻ��� ���� �Է��� �ּ��� :");
		a = sc.nextInt();
		a10 =  a/10;
		a1 = a%10;
		
		if(a>10) {
			sum = a10+a1;
			if(a%sum==0) {
				System.out.print("�ϻ��� �� �Ǻ� :true");	
			}else {
				System.out.print("�ϻ��� �� �Ǻ� :false");
			}
		}else {
			sum=a;
			System.out.print("�ϻ��� �� �Ǻ� :true");
		}
	

	}

}
