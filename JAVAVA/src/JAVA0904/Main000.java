package JAVA0904;

public class Main000 {

	public static void main(String[] args) {
		String str = "\t\t2020.4.4";
		System.out.println("����1");
		System.out.printf("��¥ : %s\n", str.trim().replace(".", "-"));
		//2020-4-4
		//trim()��  \t\t ������ ������ �����
		//replace "."  -> "-"
		//%s �� ���ڿ�  %d int
		System.out.println("���� 2");
		String str1 = str.trim();
		String str2 = str1.replace(".", "-");
		System.out.printf("��¥ : %s\n", str2);
		System.out.println("���� 3");
		System.out.printf("��¥ : %s-%02d-%02d\n", "2020",4,4);
		
		System.out.println("���� 4");
		 int year=987;
		 int month=4;
		 int day=4;
		System.out.printf("��¥ : %04d-%02d-%02d\n", year,month,day);
		//%04d-%02d-%02d\n�̰Ű�  �ϴ�  0000-00-00�� ������ ������ذ���  
		//�׷���  year��  3�ڸ��� �������� 4�ڸ��� ����� �����ϰ�����
		
		System.out.println("���� 5");
		//split ��� ��� (�ɰ���)����ϱ�      .��   .�տ�  //�ٿ������ �׳ɿܿ��!!
		String[] strs=str.trim().split("\\.");
		//strs �� �׳� ������̶�� �ǹ̷� s�ؼ�����  
		//Ʈ�� ������  3����ؼ�   �־��ְ�  �̰�  ��Ʈ������ parseing ���༭ ��ȯ �� ���
		//3����Ѱ� strs���� ��
		year=Integer.parseInt(strs[0]);
		month=Integer.parseInt(strs[1]);
		day=Integer.parseInt(strs[2]);
		System.out.printf("��¥ : %04d-%02d-%02d\n", year,month,day);
	}

}