package JAVA0916;

import java.util.Scanner;

public class CalculatorExam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.print("���������ڳ־� :");
		int num2 = sc.nextInt();
		System.out.println("�����="+cal.add(50, num2));
		System.out.println("�����="+cal.minus(17, num2));
		System.out.println("�����="+cal.multiple(836, num2));
		System.out.println("�����="+cal.divide(775, num2));
		//�ٵ� �̷���  ����Ʈ �޼��� �ȿ�  �Ǵٸ� �޼��带 �ִ°���  �����ϰ��Ҽ���������
		//������ ���忡�� ��  �Ⱦ��°��� ����.

	}

}
