package JAVA0910;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		int [] arr = new int[5];
		arr[0]= 10;
		arr[1]= 20;
		arr[2]= 30;
		arr[3]= 40;
		arr[4]= 50;
		
		//���� �߻���Ű��
		Random ran = new Random();
		//0-4������ �������� �߻���Ű��
		int num = ran.nextInt(5);
		System.out.println(arr[num]);
	}

}
