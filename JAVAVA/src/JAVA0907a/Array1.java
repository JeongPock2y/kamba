package JAVA0907a;

// ������ �迭 ��� �����ϴµ� ũ��� 50
// ���� 1-100������ Ȧ���� �迭�� �����ؼ� ����ϴ� �ڵ�
public class Array1 {

	public static void main(String[] args) {
		int num=0 ;
		int[] intArr = new int[50];
		for (int i = 1; i <= 100; i += 2) {

			intArr[num] = i;
			num++;
			
		}
		for (int k = 0; k < intArr.length; k++) {
			System.out.println("intArr[" + (k+1) + "]�� ����:" + intArr[k]);
		}

		
	}

}
