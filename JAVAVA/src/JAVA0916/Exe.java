package JAVA0916;

import java.util.Scanner;

public class Exe {
	public static void main(String[] args) {
		try {
			yourFace();
		} catch (Exception e) {
			System.out.println("��~~ �ƴϾ�");
		}
	}
	public static void yourFace() throws Exception {
		String answer;
		System.out.println("------------");
		System.out.println("�ʴ� ������?  :");
		System.out.println("------------");
		Scanner sc = new Scanner(System.in);
		answer = sc.nextLine();
		if(answer.equals("������")) {
			throw new brainException(answer);
		}else {
			System.out.println("����");
		}
	}
}

	
		
	


