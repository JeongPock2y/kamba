import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����Է� :");
		int score = sc.nextInt();
		if(score>=90) {
			System.out.println("a�Դϴ�");
		}else if(score >=80) {
			System.out.println("b�Դϴ�");
		}else if(score >=70) {
			System.out.println("c�Դϴ�");
		}else if(score >=60) {
			System.out.println("d�Դϴ�");
		}else {
			System.out.println("f�Դϴ�");
		}
		
		
		
	}

}
