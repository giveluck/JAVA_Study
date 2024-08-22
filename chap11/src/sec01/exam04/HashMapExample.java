package sec01.exam04;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Member, String> hashMap = new HashMap<Member, String>();
		hashMap.put(new Member("blue"), "value1");
		hashMap.put(new Member("red"), "value2");
		hashMap.put(new Member("blue"), "value3");
		System.out.println(hashMap.size());
	}

}
