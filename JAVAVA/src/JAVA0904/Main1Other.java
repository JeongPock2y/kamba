package JAVA0904;

public class Main1Other {

	public static void main(String[] args) {
		
        int bookstore = 1000; // å��
        int people = 2; // �ο� ��
        
        int books = bookstore * 300;
        int day = 1;
        
        while(true) {
            if(day % 10 == 0) people *= 2;    // 10�� ���� �ο� �� 2��
            books = books - people * 30;
            if(books <= 0) break;
            
            System.out.printf("%d�� %d�� ����å: %d��\n", day, people, books);
            
            day++;
        }


	}

}