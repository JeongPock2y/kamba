package StudentScoreCal;

import java.util.Scanner;
import java.util.ArrayList;

public class Score {
	public static void main(String[] args) {
		String editname;
		ArrayList<Student> arr = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ��������ѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.println(" 1.�����Է�   2.�������   3.��������   4.��������   5.����");
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			System.out.print("1��~5���޴��߿� �ϸ� �Է����ּ��� : ");
			int menu = sc.nextInt();
			Student std = new Student();
			

			switch (menu) {
			case 1:
				System.out.print("�̸��� �Է��Ͻÿ� :");
				std.setName(sc.next());// �̸�
				System.out.print("��� �Է��Ͻÿ� :");
				std.setKor(sc.nextInt());// ��
				System.out.print("��� �Է��Ͻÿ� :");
				std.setEng(sc.nextInt());// ��
				System.out.print("������ �Է��Ͻÿ� :");
				std.setMat(sc.nextInt());// ��

				arr.add(std);
				break;
			case 2:
				System.out.println("\n�ѤѤѤѤѤѤѤѤѤѤѤѤѼ�����¤ѤѤѤѤѤѤѤѤѤѤѤѤ�");
				System.out.println("�̸�\t����\t����\t����\t����\t���");
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
				
				for (Student n : arr) {
					System.out.print(n.getName() + "\t"+n.getKor()+"\t"+n.getEng()+"\t"
									+n.getMat()+"\t"+n.getTotal()+"\t"+n.getAverage());
				}
				break;
			case 3:
				System.out.println("---------------------");
				System.out.println("---���� ������� �̸��Է� ---");
				System.out.println("---------------------");
				editname = sc.nextLine();
				for (int i = 0; i < arr.size(); i++) {
					if (arr.get(i).getName().equals(editname)) {
						while (true) {
							System.out.println("--- ���� ���� ����----");
							System.out.println(" 1.��   2.��   3.����    ");
							System.out.println("-----------------");
							int choice = sc.nextInt();
							if (choice == 1) {
								System.out.print("���� �� ������� �Է����ּ��� :");
								std.setKor(sc.nextInt());
								System.out.println("������� �����Ǿ����ϴ�");
							}
							if (choice == 2) {
								System.out.print("���� �� ������� �Է����ּ��� :");
								std.setEng(sc.nextInt());
								System.out.println("������� �����Ǿ����ϴ�");
							}
							if (choice == 3) {
								System.out.print("���� �� ���м����� �Է����ּ��� :");
								std.setMat(sc.nextInt());
								System.out.println("���м����� �����Ǿ����ϴ�");
							}

						}

					}

				}

			}
		}
	}
}
