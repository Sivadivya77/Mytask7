package guvitask7;

import java.util.ArrayList;

public class Task7Arraylist {

	public static void main(String[] args) {
         
		 ArrayList <String> al1 =new ArrayList<>();
	       
	       al1.add("Siva");
	       al1.add("latha");
	       al1.add("divya");
	       al1.add("sai");
	       ////Add elements to ArrayList
	       System.out.println("ArrayList: " + al1);
	       
	       al1.removeAll(al1);
	       System.out.println("Removed ArrayList: " + al1);
	       
	}

}
/*
ArrayList: [Siva, latha, divya, sai]
Removed ArrayList: []
*/