import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��°�� :");
		int n1 = sc.nextInt();
		System.out.println("�ι�°�� :");
		int n2 = sc.nextInt();
		System.out.println("-------------");
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.����");
		System.out.println("4.������");
		System.out.println("--------------");
		System.out.println("�Ŵ� ���� :");
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 : 
			System.out.println("����"+n1+n2);
			break;
		case 2 : 
			System.out.println("����"+(n1-n2));
			break;
		case 3 :
			System.out.println("����"+(n1*n2));
			break;
		case 4 : 
			System.out.println("������"+(n1/n2));
			break;
		
		}
		
}
}