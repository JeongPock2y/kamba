import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("*****Ȧ���Է�*****");

		int count = sc.nextInt(); // Ȧ�� �Է¹��� ex))5�� �Է�(���� 5�� �Է��ߴٴ� �����Ͽ� ����)

		int o = count / 2; // �Է¹��� Ȧ�� ������2 ex)) 5/2 = 2.5 ������ ���������� 2

		for (int i = -o; i <= o; i++) { // 5�� �Է��Ͽ����� -2,-1,0,1,2 �� 5�� ���� �Ǿ��ִ�.
			int k = 0; // ���ϱ����� k�� ����, �������� Ż��� �ʱ�ȭ;
			for (int j = 0; j < count - Math.abs(i); j++) { // Math.abs(a) �Լ��� a�� ���밪���� �ν��Ѵ� ������� -2�� ��� 2���ν� /////���� ��
															// ������ 3,4,5,4,3 �� ���� �Ǿ��ִ�.
				// ù������ j = 0; j < 3 ; j ++ �� ���̴�.
				String result = k < Math.abs(i) ? " " : "*"; // ����� ���� �����ϱ����� ���׿����ڸ� ��� ���� k �� ���밪i���� ������ ���� ũ�� ���� ����ִ�
																// ����. // ���׿����� ���� >> ���ǽ� ? ���������ϋ� : ������ �����϶�
				System.out.print(result);
				k++; // �ѹ��������� k �� ���������ش�. ������ ������ üũ, Math.abs(i) �� ������ ������ ������ �Ǵµ� k�� ������ �������� ��
						// �������� result �� false �� �Ǿ� *����Եȴ�
			}
			System.out.println();
		}
	}
}