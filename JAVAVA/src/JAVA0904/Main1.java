package JAVA0904;

public class Main1 {
	
	public static void main(String[] args) {
		
		int book = 300000;
		int cp = 60; //��Ŀ���� �Ϸ翡 60�Ǿ� 
		int day=1;//���� ��
		
		
		while(true) {
			book -= cp;
			if(day%10==0) {
				cp*=2;	
			}
			if(book<=0) {
				System.out.println("å�� �� ���� ������ "+day+"��"+cp/30+"�� �Դϴ�");
				break;
			}
			day++;
		}

	}
}
			


