package Day_44_25_12_03_Collection;

import java.util.HashMap;
import java.util.Map;

public class Program_02_HashMap {

	public static void main(String[] args) {


		
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(101,"Java");
		map.put(102, "Python");
		map.put(103, "JavaScript");
		map.put(null, "NullKey");
		map.put(null, "NullKey1");
		
		System.out.println(map);
		
		
		System.out.println(map.get(102));  //
		
		Map<String , Integer> hm = new HashMap<>();
		
		hm.put("One", 1);
		hm.put("two", 2);
		hm.put("three", 3);
		
		System.out.println(hm);
		
		System.out.println("get two -->" +hm.get("two")); //2
		
		System.out.println(hm.containsKey("three"));
		
		System.out.println(hm.containsValue(3));
		
		//put wit existing key replace value
		
		hm.put("two", 22);
		System.out.println(hm);
		
		hm.putIfAbsent("two", 200);
		System.out.println(hm);
		
		hm.putIfAbsent("four", 4);
		System.out.println(hm);
		
	
		hm.put(null, 0); //alloed sngle  null key
		System.out.println(hm);
		hm.put("nullvalue", null); //value can be null
		
		System.out.println(hm);
		
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		System.out.println();
		
		for(String obj :hm.keySet()) {
			System.out.println("key :" +obj + " , Value :"+ hm.get(obj));
		}
				
		for(Object value : hm.values()) {
			System.out.println(value);
		}
		
		
		//String , Stringbuffer, Stringbuilder
	}
	

}
