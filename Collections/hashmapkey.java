package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmapkey {

	public static void main(String[] args) {
		Map<String,String> hashmap  = new HashMap();
		hashmap.put("124", "Ajay");
		hashmap.put("145", "Vijay");
		hashmap.put("645", "Sanjay");
		hashmap.put("456", "Raju");
		System.out.println("The complet pair is  = "+hashmap);
		System.out.println("The size of the element = "+hashmap.size());
		System.out.println("The keys are = "+hashmap.keySet());
		System.out.println("The value set s  = "+hashmap.values());
		for(Entry<String, String> e : hashmap.entrySet()) {
			System.out.println("Keys are = "+e.getKey()+" Values are = "+e.getValue());
		}
		
		
		
	}

}
