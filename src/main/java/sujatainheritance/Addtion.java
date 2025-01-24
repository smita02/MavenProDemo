package sujatainheritance;

public class Addtion extends AdditionSubClass {

	public static void main(String[] args) {
		AdditionSubClass subclassObj = new AdditionSubClass();
		subclassObj.add(0, 0);
		subclassObj.add(0, 0, 0);
		
		System.out.println(subclassObj.add(4,5));
		System.out.println(subclassObj.add(4, 3,10));
	}

}
