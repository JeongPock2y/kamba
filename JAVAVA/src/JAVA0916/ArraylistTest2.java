package JAVA0916;


import java.util.*;

public class ArraylistTest2 {

	public static void main(String[] args) {
		ArrayList<ArrayList<String>> arr = new ArrayList<ArrayList<String>>();
		ArrayList<String> arr1 = new ArrayList<String>();
		
		arr1.add("�����մϴ�");
		arr1.add("������  �ߺ�Ź�帳�ϴ�");
		
		arr.add(arr1);
		
		System.out.println(arr.get(0).get(0));
		System.out.println(arr.get(0).get(1));
		
		Map<String,ArrayList> hashmap = new HashMap<String, ArrayList>();//<Key,Value>
		hashmap.put("hash1",arr1);
		System.out.println(hashmap.get("hash1").get(0));
		System.out.println(hashmap.get("hash1").get(1));
		
	}

}
