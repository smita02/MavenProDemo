package collectiondemo.hashmapdemo;

import java.util.ArrayList;

public class TwoArrylist {

	public static void main(String[] args) {
	ArrayList al = new ArrayList();
	al.add(1);
	al.add(111);
	al.add(121);
	al.add(131);
	al.add(13);
	
	ArrayList ax = new ArrayList();
	ax.add(10);
	ax.add(11);
	ax.add(12);
	ax.add(13);
	ax.add(40);
//	ax.add(50);
	
	System.out.println(al.containsAll(ax));
	System.out.println(ax.containsAll(al));
	;
	
	/*
	 * ax.addAll(al); System.out.println(ax);
	 * 
	 * al.addAll(ax); System.out.println(al);
	 
	ax.removeAll(al);
	System.out.println(ax);
    
	
	
	ax.retainAll(al); // Returen uncommon elements
	System.out.println(ax);
	
	ax.addAll(3, al);
	System.out.println(ax);
	
	*/
	
	//ax.contains(al);
	
	System.out.println(ax.get(1));

	}

}
