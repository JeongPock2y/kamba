package JAVA0915;

public class Book {
	String title;// ���髹�������ݻ�Ū���
	int page;// ����� �ɹ��������� ������������ �ν��Ͻ����� �ʵ�
	int price;

	// �޼ҵ� == ���
	// ���������� -> ����Ÿ��
	// �޼ҵ带 ���� ��Ų ������ �޼ҵ带 ������ ������ �����ؾ��ϴ� ���� �ڷ���
	// string type���� �����ϰڴٶ�� �ǹ�!!
	// ������ ���ϸ� void ex)main�޼ҵ�
	// ������ �޼ҵ�� 1��~!
	// �޼ҵ� �̸� getTitle(ù���ڴ� �����ҹ���)
	// set ���� ���� get ��� ������ �� ����
	// ()method��� ǥ��!!!
	// break �� �ݺ������� return ���� �� �޼ҵ带 ����
	public String getTitle() {// ���
		
		return title;// �����ʰ��� ��ȯ�ϰ� �޼ҵ� �������
		
	}

	public void setTitle(String bookTitle) {// �Է�(String bookTitle) �̰Ŵ� ��������   ���θ޼ҵ忡��  �Էµɶ�  ����  ��½� ���� ��������
		title = bookTitle;
		return; // �̷��� ���� �����ʰ��� �����Ƿ� �����Ǳ�ɸ������Ѵ�.�������ִٴ¶�
		// �� �� if�����Ἥ ��¼�� ���� return�̷��� ���밡���ϴ�.
	}

	public int getPage() {
		return page;
	}

	public void setPage(int bookPage) {
		page = bookPage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int bookPrice) {
		price = bookPrice;
	}
	public void printBookInfo() {
		System.out.println("Title :" + title + 
					   	   "page :" + page + 
						   "Price :" + price);
	}

}
