package JAVA0909;

public class Main1 {

	public static void main(String[] args) {
		

		int[] arr = new int[100];
		for(int i=0; i<100; i++) {
			arr[i] = (int)(Math.random()*100+1);
		} 
		int sum=0;
		for(int i=0; i<100; i++) {
			sum += arr[i];
		}
		System.out.println("100���� �������� ���� ������ ����� : "+sum/100);
	}

}