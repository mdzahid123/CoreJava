package week_01;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_01 {

	/*
	 * > resizable > for each loop, iterator // for loop can't be used here > slow >
	 * Array.size()
	 */

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<Integer>();
		System.out.println("Size " + num.size());

		// Adding eliments

		num.add(10);
		num.add(20);
		num.add(30);
		num.add(3, 40);

		//System.out.println(num);
		
		/*for (int x: num) {                  // use of for each loop 
			System.out.print(" " + x); 
		}*/
		
		Iterator itr = num.iterator();
		while (itr.hasNext()) {                       // use of iterator 
			System.out.println(" " + itr.next());
		}
		
		System.out.println();
		System.out.println("Size " + num.size());
		
		
		// removing elements 
		
		num.remove(1);
		System.out.println(" After removing " + num);
		
		// clear array list 
		
		num.clear();
		
		System.out.println("After clearing " + num);
		
		boolean check = num.isEmpty();
		System.out.println("Array list empty :  " + check);
		
		// use of index position method // indexof
		
		// use of set method 
		
		// use of get method 
		
		//
		

	}

}
