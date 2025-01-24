package sujatainheritance;

public class Deposite extends Bank{
	double amt = 3343;
	
	public void depositeAMT() {
		avlBal=avlBal+amt;
		System.out.print("Total balance after Deposting" +avlBal);
	}

}
