import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		//����ڷ� ���� �Է¹ޱ� ���� Scanner ��ü
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		System.out.println("[ �л� ���� �Է� ]");
		
		//����ڷ� ���� �л� �̸��� �Է� ����.
		System.out.print("�л� �̸� : ");
		student.name= sc.nextLine();
		
		//����ڷ� ���� ���� ������ �Է� ����.
		System.out.print("���� ���� : ");
		student.kor= sc.nextInt();
		
		//����ڷ� ���� ���� ������ �Է� ����.
		System.out.print("���� ���� : ");
		student.eng= sc.nextInt();
		
		//����ڷ� ���� ���� ������ �Է� ����.
		System.out.print("���� ���� : ");
		student.mat= sc.nextInt();
		
		
		System.out.println(student.name+"���� ������"+student.getTotal()+"�� �̰�"+
							"�����"+student.getAverage()+"�� �Դϴ�.");
		
		//�Է¹��� ������ ������ Student ��ü ����
		//�ڵ带 �ۼ��Ͻÿ�.
		
		//�Է¹��� �л� �̸��� ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
		//�ڵ带 �ۼ��Ͻÿ�.
		//�Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
		//�ڵ带 �ۼ��Ͻÿ�.
		//�Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
		//�ڵ带 �ۼ��Ͻÿ�.
		//�Է¹��� ���� ������ ������ Student ��ü�� �����ϴ� �޼ҵ� ȣ��
		//�ڵ带 �ۼ��Ͻÿ�.
		
		//Student ��ü�� ����� �̸��� ����, ����� ���
		//�ڵ带 �ۼ��Ͻÿ�.
	}

}