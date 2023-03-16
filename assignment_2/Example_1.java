package assignment_2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Example_1 {

	private static final String Newdesignation = null;

	public static void main(String[] args) {
		LinkedList<String> list1 = new LinkedList<>();
		list1.add("London");
		list1.add("New york");
		
		LinkedList<String> list2 = new LinkedList<>();
		list2.add("New york");
		list2.add("Lima");
		
		LinkedList<String> list3 = new LinkedList<>();
		list3.add("Lima");
		list3.add("Sao paulo");
		
		ArrayList<LinkedList> al = new ArrayList<>();
		al.add(list1);
		al.add(list2);
		al.add(list3);
		
		System.out.print(al);
		String designation = findDesignation(al);
	}

	private static String findDesignation(ArrayList<LinkedList> al) {
       HashSet<String> Startpoint = new HashSet<>();
       HashSet<String> endpoint = new HashSet<>();
       
       
       
		return null;
	}

}
