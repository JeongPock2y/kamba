package JAVA0916;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("55");
		al.add(3, "hello");// �տ�  ���ڴ� �� �迭 ��ġ
		
		
//		for(int i=0; i<al.size(); i++) {
//			String value = al.get(i);
//			System.out.println(value);
//			//��� ���� ���� ������ٴ���  �̸� ���������� �ʾƵ� ���ڴ� ����  ���� �迭���� �ٸ���
//			// ������ �ö��� get()
//		}
//		
		
		for (String string : al) {
			System.out.println(string.toString());
		}
	}

}
