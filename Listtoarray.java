package guvitask7;

import java.util.LinkedList;
import java.util.List;

public class Listtoarray {

	private static String x;

	public static void main(String[] args) {

        // Creating a LinkedList of string type by
        // declaring object of List
        List<String> list = new LinkedList<String>();

        // Adding custom element to LinkedList
        // using add() method
        list.add("siva");
        list.add("divya");
        list.add("latha");
        list.add("vimal");
         System.out.println("Befor list to array: " +list);
        // Storing it inside array of strings
        String[] arr = new String[list.size()];

        // Converting ArrayList to Array
        // using get() method
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        // Printing elements of array on console
        System.out.print("After list to array:");
        for (String x : arr)
            
        System.out.print(x + " ");
    }

	}

/*outpot
 * Befor list to array: [siva, divya, latha, vimal]
After list to array:siva divya latha vimal */
 


