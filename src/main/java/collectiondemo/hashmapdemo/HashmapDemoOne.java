package collectiondemo.hashmapdemo;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashmapDemoOne {

	
	// How to iterate HashMap
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "A");
		hm.put(11, "B");
		hm.put(12, "C");
		hm.put(13, "D");
		hm.put(14, "E");
		hm.put(15, "F");
		hm.put(16, "G");
		
		
		
		//=============First Way===============
		System.out.println("1St Way");
		Set keys = hm.keySet();
		for(Object key :keys) {
			System.out.print(hm.get(key)+ ",");
		}
		System.out.println(hm.get(12));
		
		//=============Second Way==============
		System.out.println("Second Way");
		
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.print(hm.get(itr.next())+ " ,");
			
			
		}
		System.out.println();
		//=============Second Way==============
		System.out.println("Third Way");
		
		Collection values = hm.values();
		for(Object val:values) {
			
			System.out.print(val+ "  ");
		}

		//=============5th Way==============
		
		
			
		}
		
		
		
		
//		=============6th Way==============
		/*
		 * Iterator <Entry> itr1 = entries.iterator(); while(itr1.hasNext()) { Entry e =
		 * itr1.next(); System.out.print(e.getKey()+ "  " + e.getValue); }
		 */

		

		/*
		 * Hash map is not a collection,
		 * 
		 * 
		 * 
		 */

	

}
