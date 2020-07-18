package collection;

import java.util.HashMap;

import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {
	
		Map<String, String> map=new HashMap<>();
		//Map<String, String> map=new Hashtable<>();
		
		map.put("name", "Aniket Rajput");
		
		map.put("email", "aniket.s.rajput@gmail.com");
		
		
		map.put(null,"jjjg");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
System.out.println(map.get(null));
	}

}
