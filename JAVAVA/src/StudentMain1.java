import java.util.Scanner;

public class StudentMain1 {

	public static void main(String[] args) {
		//����ڷ� ���� �Է¹ޱ� ���� Scanner ��ü
		Scanner sc = new Scanner(System.in);
		//�ִ�10���� �л��� ������ ������ �л���ü �迭 ����
		Student[] sArray = new Student[10];
		//Student student = new Student();
		//�Է¹��� �л��̸� ������ ����
		String name;
		//�Է¹��� �л����� ������ ����
		int kor,eng,mat;
		//�Է¹��� �޴���ȣ
		int menu;
		//�迭�� ����� ��ü ����
		int count = 0;
		
		//�ݺ��ؼ� �Է¹ޱ� ���� �ݺ���
		while(true) {
			//ȭ�鿡 ����� �޴�
			System.out.println("=====================");
			System.out.println("1.���");
			System.out.println("2.���");
			System.out.println("0.����");
			System.out.println("=====================");
			//�޴���ȣ �Է¹ޱ�
			System.out.print("�޴��� �Է��� �ּ��� > ");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1:
				sc.nextLine();
				sArray[count]= new  Student();
				System.out.println("[ �л� ���� �Է� ]");
				System.out.print("�л� �̸� : ");
				sArray[count].setName(sc.nextLine());
				System.out.print("���� ���� : ");
				sArray[count].setKor(sc.nextInt());
				System.out.print("���� ���� : ");
				sArray[count].setEng(sc.nextInt());
				System.out.print("���� ���� : ");
				sArray[count].setMat(sc.nextInt());
				//sArray[count] = student;
				count++;
				
				break;
			case 2:
				for(int i=0; i< count;i++) {
					
					System.out.println(sArray[i].getName()+"���� ������"+sArray[i].getTotal()+"�̰� �����"+
					sArray[i].getAverage()+"�� �Դϴ�.");
				}
				break;
			case 0:
				System.exit(0);
				break;
			}
		}
	}

}