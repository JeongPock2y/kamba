package StudentScoreCal;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreMain {

	public static void main(String[] args) {

		ArrayList<Student> arr = new ArrayList<Student>();

		Scanner sc = new Scanner(System.in);

		String editname;//3.4�� �Ҷ� ����̸� Ȯ�ο�

		while (true) {

			System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ��������ѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println(" 1.�����Է�   2.�������   3.��������   4.��������   5.����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			int menu = sc.nextInt();
			Student std = new Student();
			switch (menu) {
			case 1:
				// �����Է�
				System.out.println("�̸��� �Է��Ͻÿ� :");
				std.setName(sc.next());// �̸�
				System.out.println("��� �Է��Ͻÿ� :");
				std.setKor(sc.nextInt());// ��
				System.out.println("��� �Է��Ͻÿ� :");
				std.setEng(sc.nextInt());// ��
				System.out.println("������ �Է��Ͻÿ�");
				std.setMat(sc.nextInt());// ��
				arr.add(std);
				break;
			case 2:
				System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ�����¤ѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("�̸�\t����\t����\t����\t����\t���");
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				// �������
				for (Student n : arr) {
					System.out.print(n.getName() + "\t");
					System.out.print(n.getKor() + "\t");
					System.out.print(n.getEng() + "\t");
					System.out.print(n.getMat() + "\t");
					System.out.print(n.getTotal() + "\t");
					System.out.println(n.getAverage() + "\t");
					
				}break;

				
			case 3:
				System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ��������ѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("              ������ �л��̸��� �Է��Ͻÿ�");
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				editname = sc.next();
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).getName().equals(editname)) {
						while (true) {
							System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
							System.out.println(editname + "�� ������ �����͸� ���ÿ�.");
							System.out.println("1.����\t 2.����\t 3.����\t 4.��������");
							System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

							int button = sc.nextInt();

							if (button == 1) {
								System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
								System.out.println("���� ������ �����մϴ�.");
								System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
								arr.get(i).setKor(sc.nextInt());
								System.out.println("�����Ϸ� ����");
							}
							if (button == 2) {
								System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤ�");
								System.out.println("���� ������ �����մϴ�.");
								System.out.println("������ ������ �Է��ϼ���.");
								System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤ�");
								arr.get(i).setEng(sc.nextInt());
								System.out.println("�����Ϸ� ����");
							}
							if (button == 3) {
								System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
								System.out.println("���� ������ �����մϴ�.");
								System.out.println("������ ������ �Է��ϼ���.");
								System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
								arr.get(i).setMat(sc.nextInt());
								System.out.println("�����Ϸ� ����");
							}
							if (button == 4) {
								System.out.println("���α׷��������մϴ�");
								break;
							}
						}

					}
				}break;

			case 4:
				System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ��������ѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("               * ������ �л��̸��� �Է��Ͻÿ�*");
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				editname = sc.next();
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).getName().equals(editname)) {
						arr.remove(i);
						System.out.println("�����Ϸ�");
					}
					

				}break;
			case 5: {
				System.out.println("���α׷��������մϴ�");
				System.exit(-1);//0������  �ܴ̿�  -1�̳�1 �Ἥ ������ ?���� ����
			}

			}

		}
	}
}
