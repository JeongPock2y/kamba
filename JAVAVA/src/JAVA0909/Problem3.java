package JAVA0909;

public class Problem3 {

	public static void main(String[] args) {
		int max=0;
		int min=0;
		int []arr = {5,3,6,7,2,4,8};
		
		
		for(int i=0; i<arr.length;i++) {
			if(i==0) {
				max =arr[i];
				min =arr[i];
			}
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("�ִ��� : "+max);
		System.out.println("�ּڰ��� : "+min);

	}

}
