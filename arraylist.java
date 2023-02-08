package arrlist;

import java.util.*;



public class arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arlist = new ArrayList<Integer>();
		
		arlist.add(1);
		arlist.add(2);
		arlist.add(3);
		arlist.add(4);
		
		System.out.println("The arraylist contains");
		System.out.println(arlist);
		System.out.println(arlist.get(1));
		System.out.println(arlist.get(2));
		
		 Iterator<Integer> iter= arlist.iterator();
		  System.out.println("\nThe iterator values" + " of list are: ");
		  while (iter.hasNext()) {
			  System.out.print(iter.next() + " ");
		  }
		  System.out.println(" ");
		  arlist.remove(1);
		  System.out.println("The List after removing Element At pos 1");
		System.out.println(arlist);
		
		System.out.println("Index of element 1 is " + arlist.indexOf(1));
		System.out.println("The size of array list is  "+ arlist.size());
		System.out.println("Cloned list is "+arlist.clone());
		arlist.add(0,5);
		arlist.add(0);
		System.out.println(arlist);
		Collections.sort(arlist);
		System.out.println("Sorted list is " +arlist );
		
		  
	}

}
