package assignment_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Example_3 {

	public static void main(String[] args) {
    LinkedList<String> List1 = new LinkedList<>();
    List1.add("A");
    List1.add("Z");
    
    ArrayList<LinkedList> al = new ArrayList<>();
    al.add(List1);
    System.out.println(al);
    String designation = finaldesignation(al);
    System.out.println(designation);
    
	}

	private static String finaldesignation(ArrayList<LinkedList> al) {
    
		HashSet <String> one = new HashSet<>();
		HashSet <String> two = new HashSet<>();
		
		for (LinkedList<String> path: al)
		{
			one.add(path.get(0));
			two.add(path.get(1));
		}
		    for (String end : two)
		    {
		    	if(!one.contains(two));
		    	{
		    		return end;
		    	}
		    }
		return null;
	}

}
