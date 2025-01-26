package guvitask7;

import java.util.Scanner;

public class Task7q3 {

	public static void main(String[] args) {
		Scanner age = new Scanner (System.in);
	      System.out.println("Enter your age");
	      int a = age.nextInt();
	     
	  try{  
	     if(a < 18){         
	        throw new InvalidAgeException();
	     }          
	    }
	    catch(InvalidAgeException ex){
	    System.out.println("You entered an invalid age: " + a);        
	    }
	    finally{
	        System.out.println("Your age is " + a);
	       
	    }   
	}

}
