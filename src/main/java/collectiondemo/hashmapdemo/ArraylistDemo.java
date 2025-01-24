package collectiondemo.hashmapdemo;

import java.util.ArrayList;
import java.util.Collection;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Hello");
		al.add(10);
		al.add(null);
		al.add("Hello");
		al.add(10);
		al.add(null);
		al.add("Hello");
		al.add(10);
		al.add("11");
		al.add(11);
		al.add(12);
		al.add(null);
		System.out.print(al.size());
		System.out.print(al.remove("11"));
		System.out.println(al.isEmpty());
		System.out.println(al.contains(10));
		System.out.println(al.contains(11));
		System.out.println(al.add(11)+ " Add 11");
		
		
		
		
		
		
		
		
		
		
		//Collection<E>  c = 
		
		

	}

}
