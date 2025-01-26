package guvitask7;

import java.util.TreeMap;

public class Task7TreeMap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String> objtree= new TreeMap<>();
	 		objtree.put(73, "Divya");
		objtree.put(74, "Vimal");
		objtree.put(75, "Arun");
		System.out.println("List of Empolyee Name: "+ objtree);
		 

		
		System.out.println("Empoyee Detalis in accending order: ");
		objtree.values().stream().sorted().forEach(System.out::println);

	}
}
/*output
 * List of Empolyee Name: {71=Siva, 72=Latha, 73=Divya, 74=Vimal, 75=Arun}
Empoyee Detalis in accending order: 
Arun
Divya
Latha
Siva
Vimal*/
