package collectiondemo.hashmapdemo;

import java.util.ArrayList;

public class ArrayListForLoopExample {

	public static void main(String[] args) {
	  ArrayList <String> cities = new ArrayList<>();
	  cities.add("Pune");
	  cities.add("Bengluru");
	  cities.add("Kolhapur");
	  
	  for(int i=0; i < cities.size(); i++) {
		  System.out.println(cities.get(i));
		  
	  }
	  

	}

}
