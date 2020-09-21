package JAVA0921;

import java.util.Scanner;

public class Train {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] in  = new int[5];
		int[] out = new int[5];
		int max=0;
		for(int i=1; i<5; i++) {
			in[i]  = sc.nextInt();
			out[i] = sc.nextInt();
			
		}
		int result[] = new int[5];
		result[0] = 0;
		for(int i=1; i<4; i++) {
			result[i] = result[i-1]+out[i]-in[i];
		}
		
		for(int i=0; i<5; i++) {
			if(max<result[i]) {
				max=result[i];
			}
		}
		System.out.println(max);
	}
	/*	0 32
		3 13
		28 25
		39 0
		�ֱٿ� ���ߵ� ������ ������ 1����(��߿�)���� 4����(������)���� 4���� �������� �ִ� �뼱���� ����ǰ� �ִ�.
		 �� �������� Ÿ�ų� ������ ��� ���� �ڵ����� �ν��� �� �ִ� ��ġ�� �ִ�. �� ��ġ�� �̿��Ͽ� ��߿����� ���������� ���� ���� ���� �ȿ�
		  ����� ���� ���� ���� ��� ���� ����Ϸ��� �Ѵ�.
	��, �� ������ �̿��ϴ� ������� ���� �ǽ��� ��ö�Ͽ�, ������ ������ Ż ��,
	 ���� ����� ��� ���� �Ŀ� ������ ź�ٰ� �����Ѵ�.
		*/

}
