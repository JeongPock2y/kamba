import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� �ݾ� �Է� :");
		int  won = sc.nextInt();//��
		if(won<0) {
			System.out.println("�߸� �Է��߽��ϴ�.");
		}else {
			System.out.println("ȯ���� ȭ��(1:�޷�, 2.��ȭ,3:����ȭ)");
			int menu = sc.nextInt();
			switch(menu) {
			case 1 : 
				double dollar = won*0.0082;
				System.out.println(won+"�� ��"+dollar+"�޷��Դϴ�.");
				break;
			case 2 : 
				double enn = won*0.08824;
				System.out.println(won+"�� ��"+enn+"��ȭ�Դϴ�.");
				break;
			case 3 : 
				double euro = won*0.0078;
				System.out.println(won+"�� ��"+euro+"����ȭ�Դϴ�.");
				break;
			default :
				System.out.println("����Է��߾�");
				
			}
			
		}
	}

}
