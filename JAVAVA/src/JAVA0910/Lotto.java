package JAVA0910;

import java.util.Random;
import java.util.Scanner;
 
public class Lotto {
    public static void main(String args[]) {
        System.out.println(">> �ζ� ���α׷�  ");
        while (true) {
 
            System.out.println("���� 6���� �Է��� �ּ���");
            int arr[] = new int[6];
            Scanner sc = new Scanner(System.in);
 
            for (int i = 0; i < 6; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > 0 && arr[i] <= 65) {
                } else {
                    System.out.println("������ �Ѿ����ϴ�.");
                    i--;
                }
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]) { // �ߺ� Ȯ��
                        System.out.println("�ߺ��Դϴ�.");
                        i--;
                    }
                    if (arr[i] < arr[j]) { // ���� ���� ����
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            System.out.print("����� �Է��� ���ڴ� : ");
            for (int i = 0; i < 6; i++) {
                System.out.print(arr[i] + " ");
            }
 
            // ��ǻ�� ���� ����
            Random ram = new Random();
            int comarr[] = new int[6];
            for (int i = 0; i < 6; i++) {
                comarr[i] = ram.nextInt(65) + 1;
                for (int j = 0; j < i; j++) {
                    if (comarr[i] == comarr[j]) {
                        i--; // �ߺ� �Ͻ� ���� ����
                    }
                }
                for (int j = 0; j < 6; j++) {
                    if (comarr[i] < comarr[j]) {
                        int temp = comarr[i];
                        comarr[i] = comarr[j];
                        comarr[j] = temp;
                    }
                }
            }
            System.out.print("�ζ� ��÷ ��ȣ�� : ");
            for (int i = 0; i < 6; i++) {
                System.out.print(comarr[i] + " ");
            }
 
            // ����ڰ� �Է��� ���ڿ� ��ǻ���� ���� ��

            System.out.println("\n\n\n\n");
            int cont = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (arr[i] == comarr[j]) {
                        cont++;
                    }
                }
            }
            if (cont == 0) {
                System.out.println("�õ� !!!");
            } else if (cont == 1) {
                System.out.println("6�� !!!");
            } else if (cont == 2) {
                System.out.println("5�� !!!");
            } else if (cont == 3) {
                System.out.println("4�� !!!");
            } else if (cont == 4) {
                System.out.println("3�� !!!");
            } else if (cont == 5) {
                System.out.println("2�� !!!");
            } else if (cont == 6) {
                System.out.println("1�� !!!");
            } else {
                System.err.println("���� !!!");
            }
            
            // ���α׷� ���� ����
            System.out.println("��� �����Ͻðڽ��ϱ�? y/n");
            String yn = sc.next();
            if (yn.equals("y") || yn.equals("Y")) {
                System.out.println(">> ��� �����ϰڽ��ϴ�.");
                continue;
            } else if (yn.equals("n") || yn.equals("N")) {
                System.out.println("���α׷��� �����մϴ�");
                System.exit(0);
            } else {
                System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ��� !!!");
                yn = sc.next();
            }
        }
    }
}