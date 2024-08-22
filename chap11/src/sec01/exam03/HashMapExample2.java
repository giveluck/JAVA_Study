package sec01.exam03;

import java.util.HashMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		hashMap.put(new Key(1), "value1");
		hashMap.put(new Key(2), "value2");
		hashMap.put(new Key(1), "value3");
		System.out.println(hashMap.size());
	}

}
