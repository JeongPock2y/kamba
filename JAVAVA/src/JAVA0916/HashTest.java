package JAVA0916;

import java.util.HashMap;

public class HashTest {

	public static void main(String[] args) {
		HashMap<String, String> hashmap = new HashMap<String, String>();
		String hi = "Offline"; 
		String bye = "Online"; 
		hashmap.put(hi,"�������Ϻ������");
		hashmap.put(bye,"â�������� ����ģ��������...��");
		
		System.out.println(hashmap.get(hi));
		System.out.println(hashmap.containsKey(hi));
		System.out.println(hashmap.get(bye));
		hashmap.remove(bye);
		System.out.println(bye);
	}
	
	
	

}
