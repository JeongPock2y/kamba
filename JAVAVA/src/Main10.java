import java.util.Scanner;

public class Main10 {
//�� �� ȣ���� �䳢 �� �� �� �� ������ �� �� ����
	public static void main(String[] args) {
		int birth, bir, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("�¾ �ظ� �Է��ϼ��� :");
		birth = sc.nextInt();
		bir = birth % 12;
		switch (bir) {
		case 1:
			System.out.println(birth + "�߶�");
			break;
		case 2:
			System.out.println(birth + "����");
			break;
		case 3:
			System.out.println(birth + "������");
			break;
		case 4:
			System.out.println(birth + "���");
			break;
		case 5:
			System.out.println(birth + "�Ҷ�");
			break;
		case 6:
			System.out.println(birth + "ȣ���̶�");
			break;
		case 7:
			System.out.println(birth + "�䳢��");
			break;
		case 8:
			System.out.println(birth + "���");
			break;
		case 9:
			System.out.println(birth + "���");
			break;
		case 10:
			System.out.println(birth + "����");
			break;
		case 11:
			System.out.println(birth + "���");
			break;
		case 0:
			System.out.println(birth + "�����̶�");
			break;

		}

	}

}
