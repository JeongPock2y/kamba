package JAVA0921;

import java.util.Scanner;

public class Carfactorymain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Carfactory[] sArray = new Carfactory[10];
		int count = 0;
		int menu;

		while (true) {

			System.out.println("=====================");
			System.out.println("1.���");
			System.out.println("2.���");
			System.out.println("0.����");
			System.out.println("=====================");
			System.out.print("�޴��Է� --->");
			menu = sc.nextInt();

			switch (menu) {

			case 1:
				sc.nextLine();
				sArray[count] = new Carfactory();
				System.out.print("�� �̸� �Է�  :");
				sArray[count].setModelname(sc.nextLine());
				System.out.print("���� ������ �Է�  : ");
				sArray[count].setColor(sc.nextLine());
				System.out.print("���� �ѹ��Է�  :");
				sArray[count].setSerial(sc.nextInt());
				System.out.print("���� �Է�   :");
				sArray[count].setMileage(sc.nextInt());
				System.out.print("�� �Ÿ��� �Է�   :");
				sArray[count].setDistance(sc.nextInt());
				count++;
				break;
			case 2:
				for(int i=0; i<count; i++) {
					Carfactory c = sArray[i];
					System.out.println(c.getModelname()+"�� "+c.getColor()+"�� �̸� "
					+c.getSerial()+" ��ȣ�� �������� ���ݱ���  "+c.getTotalDistance()+"KM ��ŭ �����ϴ�. ");
				}
				
			case 0:
				System.exit(0);
				break;

			}

		}

	}
}
