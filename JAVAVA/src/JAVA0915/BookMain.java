package JAVA0915;


public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();//��ü����������¼���  �� Ŭ���� �ʵ尡 ������
		//book��ü�� �̿�  ��ɵ��� ���
		//Book Ŭ������ ���ؼ� ����  book��ü�� Ÿ��Ʋ
		book.setTitle("����õ�ڹ�28��");//�޼ҵ带 ȣ�� �����ϴ�.
		//book.getTitle();//string �̵� ���Ϲ޾����� �׷��� �̰�  ��Ʈ�������θ������
		//String title = book.getTitle();
		//System.out.println(title);
		book.setPrice(50000);
		//int price = book.getPrice();
		//System.out.println(price+"��");
		book.setPage(150);
		//int page = book.getPage();
		//System.out.println(page+"��");
		book.printBookInfo();
		System.out.println("---------------------------------------------");
		Book book2 = new Book();
		book2.setTitle("���ϸ���1��");
		book2.setPage(200);
		book2.setPrice(5000);
		book2.printBookInfo();
		
	}

}
