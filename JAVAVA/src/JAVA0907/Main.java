package JAVA0907;

import java.util.Random;

public class Main {
//�ζ�ó��  �����Լ��� ����ؼ�  1-45���� ���� �������� 6�� ����ϴ°�
	public static void main(String[] args) {
		Random rand = new Random();
		 int[] lotto = new int[6];
		 for(int i =0; i<6; i++ ) {
		 lotto[i]=rand.nextInt(45)+1;
		 }
		 for(int i =0; i<6; i++) {
			 System.out.printf("%d\t",lotto[i]);
		 }

	}

}
