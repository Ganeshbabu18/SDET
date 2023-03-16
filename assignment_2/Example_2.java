package assignment_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Example_2 {

	public static void main(String[] args) {
    LinkedList<String> List1 = new LinkedList<>();
    List1.add("B");
    List1.add("C");
    
    LinkedList<String> List2 = new LinkedList<>();
    List2.add("D");
    List2.add("B");
    
    LinkedList<String> List3 = new LinkedList<>();
    List3.add("C");
    List3.add("A");
    
    ArrayList<LinkedList> al = new ArrayList<>();
    al.add(List1);
    al.add(List2);
    al.add(List3);
    System.out.println(al);
    String designation = finaldesignation(al);
    System.out.println(designation);
    
	}

	private static String finaldesignation(ArrayList<LinkedList> al) {
		HashSet<String> starting= new HashSet<>();
		HashSet<String> ending = new HashSet<>();
		
	    for (LinkedList<String> path : al )
	    {
			starting.add(path.get(0));
	        ending.add(path.get(1));
	    }
	    for (String end : ending)
	    {
	    	if(!starting.contains(ending));
	    	{
	    		return end;
	    	}
	    }  
		return null;
	}
	}


