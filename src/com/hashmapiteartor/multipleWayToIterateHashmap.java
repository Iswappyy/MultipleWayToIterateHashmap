package com.hashmapiteartor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class multipleWayToIterateHashmap {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		
		hm.put("Cricket", "Sachin");
		hm.put("Tennis", "Fedrar");
		hm.put("Football", "Ronaldo");
		System.out.println("::***By using Iterator of EntrySet***::");
		Set<Map.Entry<String,String>> entries = hm.entrySet();
		
		Iterator<Map.Entry<String,String>> itr = entries.iterator();
		
		while(itr.hasNext()){
			Map.Entry<String,String> entry = itr.next();
			
			System.out.println("Key: " + entry.getKey() + " :: " + "Value: " + entry.getValue());
		}
		System.out.println("::***By using Iterator of KeySet***::");
		Set<String> key = hm.keySet(); 
		Iterator<String> itr2 = key.iterator();
		while(itr2.hasNext()) {
			String key2 = itr2.next();
			System.out.println("Key: "+ key2 + " :: " + "Value: "+ hm.get(key2));
		}
	 
		System.out.println("::***By using EntrySet ForEach loop***::");
		
		Set<Map.Entry<String,String>> entries2 = hm.entrySet();
		
		for(Map.Entry<String,String> entries3 : entries2) {
			System.out.println("Key: " + entries3.getKey() + " :: " + "Value: "+ entries3.getValue());
			
		}
		
		System.out.println("::***By using KeySet ForEach loop***::");
		
		Set<String> key2 = hm.keySet();
		for(String s1 : key2) {
			System.out.println("Key: "+ s1 + " :: "+ "Value: "+ hm.get(s1));
		}
		
				
	}

}
