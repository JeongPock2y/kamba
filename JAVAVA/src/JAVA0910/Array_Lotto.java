package JAVA0910;

public class Array_Lotto {
	public static void main(String[] args) {
		int lotto[] = new int [6];
		
     	  	
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 6) + 1;
            
       		  	
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	System.out.print("�ζ� ��ȣ: ");
	
  	 // ��ȣ ���
	for(int i=0; i<6; i++) {
		System.out.print(lotto[i] + " ");
	}	
	}
}


// ��� ��� : "�ζ� ��ȣ: 1 19 17 38 33 31"