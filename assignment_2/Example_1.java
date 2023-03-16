package assignment_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Example_1 {

	private static final String Newdesignation = null;

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList();
		list1.add("London");
		list1.add("New york");
		
		LinkedList<String> list2 = new LinkedList();
		list2.add("New york");
		list2.add("Lima");
		
		LinkedList<String> list3 = new LinkedList();
		list3.add("Lima");
		list3.add("Sao paulo");
		
		ArrayList<LinkedList> al = new ArrayList<LinkedList>();
		al.add(list1);
		al.add(list2);
		al.add(list3);
		
		  System.out.println(al);
		  String designation = findDesignation(al);
		  System.out.println(designation);
	}

	private static String findDesignation(ArrayList<LinkedList> al) {
       
	   HashSet<String> Startcities = new HashSet<>();
       HashSet<String> endcities = new HashSet<>();
        for (LinkedList<String> path : al )
        {
           Startcities.add(path.get(0));
           endcities.add(path.get(1));
        }
         for ( String endcity : endcities)
            {
            	  if (!Startcities.contains(endcity))
            	    {
            		 
            	        return endcity; 
                   	}
            }
 
		return null;
	}
}

