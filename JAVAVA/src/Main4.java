import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� :");
		int n1 = sc.nextInt();
		System.out.print("�� ��° ���� :");
		int n2 = sc.nextInt();
		
		for(int i=n1; i<=n2; i++) {
			sum +=i;
		}
		System.out.println(n1+"����"+n2+"������ ���� :"+sum);
		

	}

}
