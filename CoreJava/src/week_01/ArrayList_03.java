package week_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

          //Sorting an array list
      
public class ArrayList_03 {

	public static void main(String[] args) {
		
     ArrayList<Integer>  num = new ArrayList<Integer>();
     
		num.add(20);
		num.add(-2);
		num.add(23);
		num.add(18);
		num.add(10);
		num.add(2);
		
		System.out.println("Before Sorting : " +num );
		
		Collections.sort(num);
		
		System.out.println("After Sorting in asending : " +num );
		
		Collections.sort(num, Collections.reverseOrder());
		
		System.out.println("After Sorting in desending : " +num );
		
	}

}
