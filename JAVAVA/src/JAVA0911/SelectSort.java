package JAVA0911;

public class SelectSort {

	public static void main(String[] args) {
		int min,temp;
		int[] a = {3,4,6,2,8,1};
		for(int i=0; i<a.length;i++) {
			min=i;//fine minNumber
			for(int j=i+1;j< a.length;j++) {//star2
				if(a[min]>a[j]) {//change
					min=j;
				}
			}
//			temp = a[min];
//			a[min]= a[i];
//			a[i]=temp;
			
		}
				
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}
