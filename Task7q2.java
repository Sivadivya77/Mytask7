package guvitask7;

public class Task7q2 {

	public static void main(String[] args) {
		String [] s= {"loin","Tiger","zebra"};
		try {
			System.out.println(s[4]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index does not exist");
		}
		
		String name = "Siva";
		try {
			String sub=name.substring(2, 8);
			System.out.println(sub);
			
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String index invalid");
		}

		}
	}
/*
 * output
 * Array index does not exist
String index invalid*
 */


