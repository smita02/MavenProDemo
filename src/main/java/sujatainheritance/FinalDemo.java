package sujatainheritance;

public class FinalDemo {
	
	
	public static void main(String[] args) {
		
		final int array[] = { 12, 56, 4, 24, 6 };

		array[4] = 43;

		for (int i = 0; i <= array.length - 1; i++) {

			System.out.println(array[i]);

		}
	}
}
