package test04;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest3 {
	
	public static void main(String[] args) {
		ArrayList<HashMap<String,String>> dogList = new ArrayList<HashMap<String,String>>();
		
		HashMap<String,String> dog1 = new HashMap<String,String>();
		dog1.put("동물이름", "초코");
		dog1.put("나이", "3");
		dogList.add(dog1);
		
		HashMap<String,String> dog2 = new HashMap<String,String>();
		dog2.put("동물이름", "달이");
		dog2.put("나이", "2");
		dogList.add(dog2);
		
		HashMap<String,String> dog3 = new HashMap<String,String>();
		dog3.put("동물이름", "까미");
		dog3.put("나이", "5");
		dogList.add(dog3);
		
		HashMap<String,String> dog4 = new HashMap<String,String>();
		dog4.put("동물이름", "개리");
		dog4.put("나이", "1");
		dogList.add(dog4);
		
		for (int i = 0; i < dogList.size(); i++) {
			System.out.println(dogList.get(i));
		}
		
		for (HashMap<String,String> hm : dogList) {
			System.out.println(hm);
		}
	}

}
