package sec01.exam03;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("key1", "value1");
		hashMap.put("key2", "value2");
		hashMap.put("key1", "value3");
		System.out.println(hashMap.size());
		
	}

}
