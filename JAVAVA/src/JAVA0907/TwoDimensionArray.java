package JAVA0907;

public class TwoDimensionArray {

	public static void main(String[] args) {
		int[][] timesTable;//��������
		timesTable = new int[8][9];
		int i,j;
		
		for( i =2; i<10; i++) {
			for(j=1; j<10; j++) {
				timesTable[i-2][j-1] =  i*j;  
				//0���ͽ����̶� ���� i�� 2 j�� 1�� ���־���.
			}
		}
		for( i =2; i<10; i++) {
			for(j=1; j<10; j++) {
			System.out.println(i+"*"+j+"*"+timesTable[i-2][j-1]);
			if(j==9) {
				System.out.println(" ");
				
			  }
			}
			
			
		}
	}	

}
